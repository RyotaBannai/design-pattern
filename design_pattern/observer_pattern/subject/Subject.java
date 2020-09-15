package design_pattern.observer_pattern.subject;

import design_pattern.observer_pattern.observer.Observer;

public interface Subject {
  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();

}