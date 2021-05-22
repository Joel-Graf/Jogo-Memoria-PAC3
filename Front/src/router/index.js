import Vue from "vue";
import VueRouter from "vue-router";
import ViewAnimal from "../views/ViewAnimal.vue";
import ViewGame from "../views/ViewGame.vue";
import ViewLevelSelect from "../views/ViewLevelSelect.vue";
import ViewLogin from "../views/ViewLogin.vue";
import ViewMenu from "../views/ViewMenu.vue";
import ViewRanking from "../views/ViewRanking.vue";
import ViewRegister from "../views/ViewRegister.vue";
import ViewZoo from "../views/ViewZoo.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/Game",
    name: "Game",
    component: ViewGame,
  },
  {
    path: "/Animal",
    name: "Animal",
    component: ViewAnimal,
  },
  {
    path: "/LevelSelect",
    name: "LevelSelect",
    component: ViewLevelSelect,
  },
  {
    path: "/Login",
    name: "Login",
    component: ViewLogin,
  },
  {
    path: "/Menu",
    name: "Menu",
    component: ViewMenu,
  },
  {
    path: "/Ranking",
    name: "Ranking",
    component: ViewRanking,
  },
  {
    path: "/Register",
    name: "Register",
    component: ViewRegister,
  },
  {
    path: "/Zoo",
    name: "Zoo",
    component: ViewZoo,
  },
  {
    path: "/*",
    name: "Login",
    component: ViewLogin,
  },
];

const router = new VueRouter({
  routes,
});

export default router;
