package fr.demandeatonton.pizzeria.pizzas;

public class Reine extends Pizza {

   @Override
   public float getCost() {
      return 15.99f;
   }

   @Override
   public String getDescription() {
      return "La Reine : Jambon et Fromage";
   }

}
