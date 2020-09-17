package design_patterns.iterator_api.menu;

import java.util.ArrayList;
import java.util.Iterator;
import design_patterns.iterator_api.menu.MenuItem;

public class PancakeHouseMenu implements Menu {
  ArrayList menuItems = new ArrayList();

  public PancakeHouseMenu() {
    addItem("K&B Pancake", "スクランブルエッグとトーストが付いたパンケーキ", true, 2.99);
    addItem("Blueberry Pancake", "新鮮なブルベリーで作ったパンケーキ", false, 3.49);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public Iterator createIterator() {
    return menuItems.iterator();
  }
}