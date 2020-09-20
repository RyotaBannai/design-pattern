package design_patterns.compound.duck;

import design_patterns.compound.Quackable;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class RedheadDuck implements Quackable {
  Observable observable;

  public RedheadDuck() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("ga-ga-");
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}