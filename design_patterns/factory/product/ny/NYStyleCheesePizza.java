package design_patterns.factory.product.ny;

import design_patterns.factory.product.Pizza;

public class NYStyleCheesePizza extends Pizza {

  public NYStyleCheesePizza() {
    name = "New York Style Sauce and Cheese Pizza";
    dough = "thin crust dough";
    sauce = "marinara";

    toppings.add("reggiano");
  }
}