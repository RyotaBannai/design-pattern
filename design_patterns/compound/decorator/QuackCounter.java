package design_patterns.compound.decorator;

import design_patterns.compound.Quackable;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class QuackCounter implements Quackable {
  Quackable duck;
  static int numberOfQuacks = 0;

  Observable observable;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
    this.observable = new Observable(this);
  }

  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }

  public static int getQuacks() {
    return numberOfQuacks;
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}