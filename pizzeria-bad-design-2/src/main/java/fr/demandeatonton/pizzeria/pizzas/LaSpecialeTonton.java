package fr.demandeatonton.pizzeria.pizzas;

public class LaSpecialeTonton extends Pizza {

   @Override
   public float getCost() {
      return super.getCost() + 19.99f;
   }

   @Override
   public String getDescription() {
      return "Tomates, Cr�me fraiche, Chorizo, Oignons, Champignons, Ch�vre, Camembert, Mozzarella et Emmental"
            + super.getDescription();
   }

}
