package design_patterns.compound.duck;

import design_patterns.compound.Quackable;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class RubberDuck implements Quackable {
  Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("kyu- kyu- i'm not a real duck");
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}