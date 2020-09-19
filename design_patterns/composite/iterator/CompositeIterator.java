package design_patterns.composite.iterator;

import java.util.*;

import design_patterns.composite.composite.Menu;
import design_patterns.composite.composite.MenuComponent;

public class CompositeIterator implements Iterator {
  /** 外部イテレータ */
  Stack stack = new Stack();

  public CompositeIterator(Iterator iterator) {
    stack.push(iterator);
  }

  public MenuComponent next() {
    if (hasNext()) {
      Iterator iterator = (Iterator) stack.peek(); // stack の先頭の項目を確認する peek（取り出すわけではない）
      MenuComponent component = (MenuComponent) iterator.next();
      if (component instanceof Menu) {
        stack.push(component.createIterator()); // スタックの先頭にオブジェクトを入れる push
      }
      return component;
    } else
      return null;
  }

  public boolean hasNext() {
    if (stack.empty()) {
      return false;
    } else {
      Iterator iterator = (Iterator) stack.peek();
      if (!iterator.hasNext()) {
        stack.pop();
        return hasNext();
      } else {
        return true;
      }
    }
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

}