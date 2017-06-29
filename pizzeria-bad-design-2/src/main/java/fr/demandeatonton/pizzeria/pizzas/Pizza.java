package fr.demandeatonton.pizzeria.pizzas;

public abstract class Pizza {
   protected boolean olives;
   protected boolean anchois;
   protected boolean chorizo;

   public float getCost() {
      float cost = 0;
      if (olives) {
         cost += .99f;
      }
      if (anchois) {
         cost += 1.99f;
      }
      if (chorizo) {
         cost += 2.99f;
      }
      return cost;
   }

   public String getDescription() {
      String description = "";

      if (olives || anchois || chorizo) {
         description += " avec ";
         if (olives) {
            description += "olives ";
         }
         if (anchois) {
            description += "anchois ";
         }
         if (chorizo) {
            description += "chorizo ";
         }
      }
      return description;
   }

   public boolean isOlives() {
      return olives;
   }

   public void setOlives(boolean olives) {
      this.olives = olives;
   }

   public boolean isAnchois() {
      return anchois;
   }

   public void setAnchois(boolean anchois) {
      this.anchois = anchois;
   }

   public boolean isChorizo() {
      return chorizo;
   }

   public void setChorizo(boolean chorizo) {
      this.chorizo = chorizo;
   }

}
