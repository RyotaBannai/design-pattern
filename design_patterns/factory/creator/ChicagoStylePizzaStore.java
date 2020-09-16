package design_patterns.factory.creator;

import design_patterns.factory.product.Pizza;
import design_patterns.factory.product.chicago.*;

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