package design_patterns.template_method.test;

import design_patterns.template_method.CaffeineBeverage;
import design_patterns.template_method.Coffee;

public class BeverageTestDrive {
  public static void main(String[] args) {
    CaffeineBeverage coffee = new Coffee();
    System.out.println("<<< Making coffee >>>");

    coffee.prepareRecipe();
  }
}