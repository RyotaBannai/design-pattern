package design_patterns.iterator_api.menu;

import java.util.Iterator;

import design_patterns.iterator_api.iterator.DinerMenuIterator;
import design_patterns.iterator_api.menu.MenuItem;

public class DinerMenu implements Menu {

  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT", "レタス、トマト、ベーコンを挟んだサンドイッチ", false, 2.99);
    addItem("Hotdog", "ザワークラウト、レリッシュ、玉ねぎ、チーズを挟んだホットドック", false, 3.05);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems > MAX_ITEMS) {
      System.out.println("追加できるメニューの最大数に達しました");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems += 1;
    }
  }

  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}