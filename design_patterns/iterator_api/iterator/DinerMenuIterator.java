package design_patterns.iterator_api.iterator;

import java.util.Iterator;
import design_patterns.iterator_api.menu.MenuItem;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public Object next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  public boolean hasNext() {
    if (position >= items.length || items[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  public void remove() {
    if (position <= 0) {
      throw new IllegalStateException("Can't remove an item before the first iteration.");
    }
    // iterate している最中、 n-position 時の item が null でなければ, n-position の item を削除し、その後ろの
    // items を全部１つ前方に移動
    if (items[position - 1] != null) {
      for (int i = position - 1; i < items.length + 1; i++) {
        items[i] = items[i + 1];
      }
      items[items.length - 1] = null;
    }
  }
}