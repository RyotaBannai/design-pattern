package design_patterns.compound.composite;

import java.util.ArrayList;

import design_patterns.compound.Quackable;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class Flock implements Quackable { // Leaf node は Quackable
  ArrayList<Quackable> quackers = new ArrayList<Quackable>();
  Observable observable;

  public Flock() {
    this.observable = new Observable(this);
  }

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  public void quack() {
    for (Quackable quacker : quackers) {
      quacker.quack();
    }
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}