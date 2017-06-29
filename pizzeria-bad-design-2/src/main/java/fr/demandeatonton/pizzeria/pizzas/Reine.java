package fr.demandeatonton.pizzeria.pizzas;

public class Reine extends Pizza {

   @Override
   public float getCost() {
      return super.getCost() + 15.99f;
   }

   @Override
   public String getDescription() {
      return "Jambon et Fromage" + super.getDescription();
   }

}
