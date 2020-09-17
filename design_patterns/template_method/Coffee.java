package design_patterns.template_method;

public class Coffee extends CaffeineBeverage {
  public void brew() {
    System.out.println("Brewing coffee");
  }

  public void addCondiments() {
    System.out.println("Adding sugar and milk into coffee");
  }
}