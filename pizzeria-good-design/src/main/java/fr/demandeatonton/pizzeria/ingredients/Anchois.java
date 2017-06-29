package fr.demandeatonton.pizzeria.ingredients;

import fr.demandeatonton.pizzeria.pizzas.Pizza;

public class Anchois extends IngredientDecorator {
   Pizza pizza;

   public Anchois(Pizza pizza) {
      this.pizza = pizza;
   }

   @Override
   public String getDescription() {
      return pizza.getDescription() + " anchois";
   }

   @Override
   public float getCost() {
      return 1.99f + pizza.getCost();
   }

}
