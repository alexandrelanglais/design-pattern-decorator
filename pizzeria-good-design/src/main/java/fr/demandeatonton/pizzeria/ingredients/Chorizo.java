package fr.demandeatonton.pizzeria.ingredients;

import fr.demandeatonton.pizzeria.pizzas.Pizza;

public class Chorizo extends IngredientDecorator {
   Pizza pizza;

   public Chorizo(Pizza pizza) {
      this.pizza = pizza;
   }

   @Override
   public String getDescription() {
      return pizza.getDescription() + " chorizo";
   }

   @Override
   public float getCost() {
      return 2.99f + pizza.getCost();
   }

}
