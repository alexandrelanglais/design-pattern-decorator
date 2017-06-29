package fr.demandeatonton.pizzeria.pizzas;

public class QuatreFromages extends Pizza {

   @Override
   public float getCost() {
      return 13.99f;
   }

   @Override
   public String getDescription() {
      return "La Quatre Fromages : Ch�vre, Camembert, Mozzarella et Emmental";
   }

}
