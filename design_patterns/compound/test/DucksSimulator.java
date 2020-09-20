package design_patterns.compound.test;

import design_patterns.compound.composite.Flock;
import design_patterns.compound.decorator.QuackCounter;
import design_patterns.compound.factory.*;
import design_patterns.compound.observer.observer.Quackologist;
import design_patterns.compound.Quackable;

public class DucksSimulator {
  public static void main(String[] args) {
    DucksSimulator simulator = new DucksSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }

  public void simulate(AbstractDuckFactory duckFactory) {
    Flock flock = new Flock();
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable goose = duckFactory.createGoose();

    System.out.println("カモシミュレータ");
    flock.add(mallardDuck);
    flock.add(redheadDuck);
    flock.add(duckCall);
    flock.add(rubberDuck);
    flock.add(goose);

    Flock mallardFlock = new Flock();
    mallardFlock.add(mallardDuck);
    mallardFlock.add(mallardDuck);
    mallardFlock.add(mallardDuck);

    flock.add(mallardFlock);
    simulate(flock);

    System.out.println("カモシミュレータ オブザーバー付き");
    Quackologist quackologist = new Quackologist();
    flock.registerObserver(quackologist);

    simulate(flock);

    System.out.println("the number of Quacks " + QuackCounter.getQuacks());

  }

  public void simulate(Quackable duck) {
    duck.quack();
  }
}