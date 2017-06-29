package fr.demandeatonton.pizzeria;

import java.text.DecimalFormat;

import fr.demandeatonton.pizzeria.ingredients.Anchois;
import fr.demandeatonton.pizzeria.ingredients.Chorizo;
import fr.demandeatonton.pizzeria.ingredients.Olives;
import fr.demandeatonton.pizzeria.pizzas.LaSpecialeTonton;
import fr.demandeatonton.pizzeria.pizzas.Pizza;
import fr.demandeatonton.pizzeria.pizzas.QuatreFromages;
import fr.demandeatonton.pizzeria.pizzas.Reine;
import fr.demandeatonton.pizzeria.pizzas.Vegetarienne;

public class Pizzeria {

   public static void main(String[] args) {
      Pizza quatreFromages = new QuatreFromages();
      Pizza quatreFromagesOlivesAnchois = new Olives(new Anchois(new QuatreFromages()));
      Pizza specialeTonton = new LaSpecialeTonton();
      Pizza specialeTontonOlives = new Olives(new LaSpecialeTonton());
      Pizza specialeTontonDoubleOlives = new Olives(new Olives(new LaSpecialeTonton()));
      Pizza reine = new Reine();
      Pizza reineAnchoisOliveChorizo = new Olives(new Anchois(new Chorizo(new Reine())));
      Pizza vegetarienne = new Vegetarienne();

      show(quatreFromages);
      show(quatreFromagesOlivesAnchois);
      show(specialeTonton);
      show(specialeTontonOlives);
      show(specialeTontonDoubleOlives);
      show(reine);
      show(reineAnchoisOliveChorizo);
      show(vegetarienne);
   }

   private static void show(Pizza pizza) {
      DecimalFormat df = new DecimalFormat("0.00");
      System.out.println(
            String.format("Description = %s - Prix = %s€", pizza.getDescription(), df.format(pizza.getCost())));
   }

}
