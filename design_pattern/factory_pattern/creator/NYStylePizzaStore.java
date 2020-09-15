package design_pattern.factory_pattern.creator;

import design_pattern.factory_pattern.product.Pizza;
import design_pattern.factory_pattern.product.ny.*;

public class NYStylePizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) {
    if (type.equals("チーズ")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("ペパロニ")) {
      return new NYStylePepperoniPizza();
    } else
      return null;
  }
}