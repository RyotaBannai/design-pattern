package design_patterns.template_method;

public abstract class CaffeineBeverage {
  // Template Method
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // Concrete Operation1
  final void boilWater() {
    System.out.println("Boiling water");
  };

  // Concrete Operation2
  final void pourInCup() {
    System.out.println("Pouring to a cup");
  };

  // Primitive Operation1, which has to be implemented in concrete sub classes
  public abstract void brew();

  // Primitive Operation2
  public abstract void addCondiments();
}