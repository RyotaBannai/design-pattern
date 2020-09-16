package design_patterns.factory.creator;

import design_patterns.factory.product.Pizza;
import design_patterns.factory.product.ny.*;

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