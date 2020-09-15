package design_pattern.decorator.beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "ハウスブレンド";
  }

  public double cost() {
    return .89;
  }
}