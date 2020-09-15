package design_pattern.factory.test;

import design_pattern.factory.product.Pizza;
import design_pattern.factory.creator.NYStylePizzaStore;
import design_pattern.factory.creator.PizzaStore;

public class PizzaTestDrive {
  public static void main(String args[]) {
    PizzaStore nyStore = new NYStylePizzaStore();
    Pizza pizza = nyStore.orderPizza("チーズ");
    System.out.println("イーサンの注文は" + pizza.getName());
  }
}