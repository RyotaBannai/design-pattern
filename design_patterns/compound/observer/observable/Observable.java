package design_patterns.compound.observer.observable;

import java.util.ArrayList;

import design_patterns.compound.observer.observer.Observer;

public class Observable implements QuackObservable {
  ArrayList<Observer> observers = new ArrayList<Observer>();
  QuackObservable duck;

  public Observable(QuackObservable duck) {
    this.duck = duck;
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update((QuackObservable) duck);
    }
  }
}