package design_patterns.observer.subject;

import design_patterns.observer.observer.Observer;

public interface Subject {
  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();

}