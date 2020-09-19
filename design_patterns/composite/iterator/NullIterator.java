package design_patterns.composite.iterator;

import java.util.Iterator;

import design_patterns.composite.composite.MenuComponent;

public class NullIterator implements Iterator {
  public MenuComponent next() {
    return null;
  }

  public boolean hasNext() {
    return false;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}