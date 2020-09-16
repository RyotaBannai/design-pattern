package design_patterns.factory.test;

import design_patterns.factory.product.Pizza;
import design_patterns.factory.creator.NYStylePizzaStore;
import design_patterns.factory.creator.PizzaStore;

public class PizzaTestDrive {
  public static void main(String args[]) {
    PizzaStore nyStore = new NYStylePizzaStore();
    Pizza pizza = nyStore.orderPizza("チーズ");
    System.out.println("イーサンの注文は" + pizza.getName());
  }
}