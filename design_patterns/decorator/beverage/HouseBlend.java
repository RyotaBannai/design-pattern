package design_patterns.decorator.beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "ハウスブレンド";
  }

  public double cost() {
    return .89;
  }
}