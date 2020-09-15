package design_pattern.observer.subject;

import design_pattern.observer.observer.Observer;

public interface Subject {
  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();

}