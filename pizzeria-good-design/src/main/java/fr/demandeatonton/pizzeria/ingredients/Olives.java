package fr.demandeatonton.pizzeria.ingredients;

import fr.demandeatonton.pizzeria.pizzas.Pizza;

public class Olives extends IngredientDecorator {
   Pizza pizza;

   public Olives(Pizza pizza) {
      this.pizza = pizza;
   }

   @Override
   public String getDescription() {
      return pizza.getDescription() + " olives";
   }

   @Override
   public float getCost() {
      return 0.99f + pizza.getCost();
   }

}
