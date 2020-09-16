package design_patterns.adaptor.bird.adaptor;

import design_patterns.adaptor.bird.Turkey;
import design_patterns.adaptor.duck.Duck;
import java.util.Random;

public class DuckAdaptor implements Turkey {
  Duck duck;

  DuckAdaptor(Duck duck) {
    this.duck = duck;
  }

  public void gobble() {
    duck.quack();
  }

  Random rnd = new Random();

  public void fly() {
    if (rnd.nextInt(5) == 0) {
      duck.fly();
    }
  }
}