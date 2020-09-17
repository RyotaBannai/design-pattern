package design_patterns.iterator.iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
  ArrayList items;
  int position;

  public PancakeMenuIterator(ArrayList items) {
    this.items = items;
  }

  public Object next() {
    return items.get(position++);
  }

  public boolean hasNext() {
    if (position >= items.size()) {
      return false;
    } else {
      return true;
    }
  }
}