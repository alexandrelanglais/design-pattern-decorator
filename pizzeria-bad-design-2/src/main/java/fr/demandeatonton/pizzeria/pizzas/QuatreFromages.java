package fr.demandeatonton.pizzeria.pizzas;

public class QuatreFromages extends Pizza {

   @Override
   public float getCost() {
      return super.getCost() + 13.99f;
   }

   @Override
   public String getDescription() {
      return "Chèvre, Camembert, Mozzarella et Emmental" + super.getDescription();
   }

}
