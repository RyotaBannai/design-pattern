package design_patterns.adaptor.test;

import design_patterns.adaptor.bird.WildTurkey;
import design_patterns.adaptor.duck.*;
import design_patterns.adaptor.duck.adaptor.TurkeyAdapter;

public class DuckTestDrive {
  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey(); // Turkey は アダプティ interface
    Duck turkeyAdapter = new TurkeyAdapter(turkey); // アダプタは target interface を実装(Duck)
    turkey.gobble();
    turkey.fly();

    testDuck(duck);
    testDuck(turkeyAdapter);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}