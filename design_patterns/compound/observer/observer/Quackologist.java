package design_patterns.compound.observer.observer;

import design_patterns.compound.observer.observable.QuackObservable;

public class Quackologist implements Observer {
  public void update(QuackObservable duck) {
    // System.out.println("Quackologist says..." + duck + "が今鳴きました！");
  }
}