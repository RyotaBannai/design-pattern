package design_patterns.factory.product.ny;

import design_patterns.factory.product.Pizza;

public class NYStylePepperoniPizza extends Pizza {

  public NYStylePepperoniPizza() {
    name = "New York Style Pepperoni Pizza";
    dough = "thin crust dough";
    sauce = "marinara";

    toppings.add("pepperoni");
  }

}