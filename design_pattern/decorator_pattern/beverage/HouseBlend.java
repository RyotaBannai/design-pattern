package design_pattern.decorator_pattern.beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "ハウスブレンド";
  }

  public double cost() {
    return .89;
  }
}