package design_pattern.factory.creator;

import design_pattern.factory.product.Pizza;
import design_pattern.factory.product.chicago.*;

public class ChicagoStylePizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) {
    if (type.equals("チーズ")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("ペパロニ")) {
      return new ChicagoStylePepperoniPizza();
    } else
      return null;
  }
}