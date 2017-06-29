package fr.demandeatonton.pizzeria.pizzas;

public class LaSpecialeTonton extends Pizza {

   @Override
   public float getCost() {
      return super.getCost() + 19.99f;
   }

   @Override
   public String getDescription() {
      return "Tomates, Crème fraiche, Chorizo, Oignons, Champignons, Chèvre, Camembert, Mozzarella et Emmental"
            + super.getDescription();
   }

}
