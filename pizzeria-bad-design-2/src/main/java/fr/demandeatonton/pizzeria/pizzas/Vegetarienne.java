package fr.demandeatonton.pizzeria.pizzas;

public class Vegetarienne extends Pizza {

   @Override
   public float getCost() {
      return super.getCost() + 9.99f;
   }

   @Override
   public String getDescription() {
      return "Tomates et Salade" + super.getDescription();
   }

}
