package design_patterns.template_method;

public class Tea extends CaffeineBeverage {

  public void brew() {
    System.out.println("Steep the tea bags");
  }

  public void addCondiments() {
    System.out.println("Adding lemons into tea");
  }
}