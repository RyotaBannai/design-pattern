package design_pattern.factory.creator;

import design_pattern.factory.product.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  protected abstract Pizza createPizza(String type);
}