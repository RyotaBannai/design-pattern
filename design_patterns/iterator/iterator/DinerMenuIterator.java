package design_patterns.iterator.iterator;

import design_patterns.iterator.menu.MenuItem;

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
    if (position >= items.length || items[position] == null) { // pure Array を使うときは 初期化の状態だと null なのでこの処理もいれる
      return false;
    } else {
      return true;
    }
  }
}