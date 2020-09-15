package design_pattern.factory_pattern.product.ny;

import design_pattern.factory_pattern.product.Pizza;

public class NYStylePepperoniPizza extends Pizza {

  public NYStylePepperoniPizza() {
    name = "New York Style Pepperoni Pizza";
    dough = "thin crust dough";
    sauce = "marinara";

    toppings.add("pepperoni");
  }

}