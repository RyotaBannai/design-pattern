package design_pattern.factory.product.chicago;

import design_pattern.factory.product.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

  public ChicagoStylePepperoniPizza() {
    name = "New York Style Pepperoni Pizza";
    dough = "thin crust dough";
    sauce = "marinara";

    toppings.add("pepperoni");
  }

  @Override
  public void cut() {
    System.out.println("ピザを四角形に切り分ける");
  }

}