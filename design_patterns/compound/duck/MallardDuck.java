package design_patterns.compound.duck;

import design_patterns.compound.Quackable;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class MallardDuck implements Quackable {
  Observable observable;

  public MallardDuck() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("ga-ga-");
    observable.notify();
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}