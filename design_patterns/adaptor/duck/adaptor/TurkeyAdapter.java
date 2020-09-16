package design_patterns.adaptor.duck.adaptor;

import design_patterns.adaptor.bird.Turkey;
import design_patterns.adaptor.duck.Duck;

public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  public void quack() {
    turkey.gobble();
  }

  public void fly() {
    for (int i = 0; i < 5; i++) {
      /** 5 times because turkey can't as much distance as dock can do... */
      turkey.fly();
    }
  }
}