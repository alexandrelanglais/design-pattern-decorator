package fr.demandeatonton.pizzeria;

import java.text.DecimalFormat;

import fr.demandeatonton.pizzeria.pizzas.LaSpecialeTonton;
import fr.demandeatonton.pizzeria.pizzas.Pizza;
import fr.demandeatonton.pizzeria.pizzas.QuatreFromages;
import fr.demandeatonton.pizzeria.pizzas.Reine;
import fr.demandeatonton.pizzeria.pizzas.Vegetarienne;

public class Pizzeria {

   public static void main(String[] args) {
      Pizza quatreFromagesSimple = new QuatreFromages();
      Pizza quatreFromagesAvecAnchois = new QuatreFromages();
      Pizza specialeTonton = new LaSpecialeTonton();
      Pizza reineAvecOlivesEtChorizo = new Reine();
      Pizza vegetarienneAvecOlives = new Vegetarienne();

      quatreFromagesAvecAnchois.setAnchois(true);

      reineAvecOlivesEtChorizo.setOlives(true);
      reineAvecOlivesEtChorizo.setChorizo(true);

      vegetarienneAvecOlives.setOlives(true);

      show(quatreFromagesSimple);
      show(quatreFromagesAvecAnchois);
      show(specialeTonton);
      show(reineAvecOlivesEtChorizo);
      show(vegetarienneAvecOlives);
   }

   private static void show(Pizza pizza) {
      DecimalFormat df = new DecimalFormat("0.00");
      System.out.println(String.format("%s : Prix = %s€ - Description = %s", pizza.getClass().getSimpleName(),
            df.format(pizza.getCost()), pizza.getDescription()));
   }

}
