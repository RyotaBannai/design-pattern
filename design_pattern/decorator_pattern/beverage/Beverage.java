package design_pattern.decorator_pattern.beverage;

public abstract class Beverage {
  String description = "不明な飲み物";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}