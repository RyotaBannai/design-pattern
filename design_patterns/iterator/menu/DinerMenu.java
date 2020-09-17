package design_patterns.iterator.menu;

import design_patterns.iterator.iterator.DinerMenuIterator;
import design_patterns.iterator.iterator.Iterator;
import design_patterns.iterator.menu.MenuItem;

public class DinerMenu {
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

  // public MenuItem[] getMenuItems() {
  // return menuItems;
  // }

  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}