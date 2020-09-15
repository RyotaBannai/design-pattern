package design_pattern.factory.creator;

import design_pattern.factory.product.Pizza;
import design_pattern.factory.product.ny.*;

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