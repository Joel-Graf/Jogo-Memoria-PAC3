package com.pac3.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pac3.entity.Animal;
import com.pac3.model.JogoModel;
import com.pac3.repository.AnimalRepository;
import com.pac3.repository.BiomaRepository;

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/pac3")
public class JogoController {

	private final AnimalRepository animalRepository;
	private final BiomaRepository biomaRepository;
	
	JogoController(AnimalRepository animalRepository, BiomaRepository biomaRepository) {
		this.animalRepository = animalRepository;
		this.biomaRepository = biomaRepository;
	}

	@PostMapping("/animais")
	 public List<Animal> obterAnimais(@RequestBody JogoModel newJogo) {
		List<Animal> todosAnimais = animalRepository.findByBioma(biomaRepository.findById(newJogo.getIdBioma()));
		List<Animal> animais = new ArrayList<Animal>();
		
		Random gerador = new Random();
		for(int i=1;i<=newJogo.getQuantidadeCartas();i++) {
		    long index = gerador.nextInt(todosAnimais.size());
		    System.out.println("index" + index );
		    if (index==0) {
		    	 i-=1;
				 continue;
		    }
		    animais.add(animalRepository.findById(index).orElse(null));
		}
		
		return animais;
	}
}
