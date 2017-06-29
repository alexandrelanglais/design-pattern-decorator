package fr.demandeatonton.pizzeria.pizzas;

public class Vegetarienne extends Pizza {

   @Override
   public float getCost() {
      return 9.99f;
   }

   @Override
   public String getDescription() {
      return "La Végétarienne : Tomates et Salade";
   }

}
