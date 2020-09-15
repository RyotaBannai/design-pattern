package design_pattern.factory_pattern.creator;

import design_pattern.factory_pattern.product.Pizza;
import design_pattern.factory_pattern.product.chicago.*;

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