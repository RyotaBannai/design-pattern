package design_pattern.factory_pattern.test;

import design_pattern.factory_pattern.product.Pizza;
import design_pattern.factory_pattern.creator.NYStylePizzaStore;
import design_pattern.factory_pattern.creator.PizzaStore;

public class PizzaTestDrive {
  public static void main(String args[]) {
    PizzaStore nyStore = new NYStylePizzaStore();
    Pizza pizza = nyStore.orderPizza("チーズ");
    System.out.println("イーサンの注文は" + pizza.getName());
  }
}