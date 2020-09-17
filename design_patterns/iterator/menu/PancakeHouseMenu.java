package design_patterns.iterator.menu;

import java.util.ArrayList;

import design_patterns.iterator.iterator.Iterator;
import design_patterns.iterator.iterator.PancakeMenuIterator;
import design_patterns.iterator.menu.MenuItem;

public class PancakeHouseMenu {
  ArrayList menuItems = new ArrayList();

  public PancakeHouseMenu() {
    addItem("K&B Pancake", "スクランブルエッグとトーストが付いたパンケーキ", true, 2.99);
    addItem("Blueberry Pancake", "新鮮なブルベリーで作ったパンケーキ", false, 3.49);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  // public ArrayList getMenuItems() {
  // return menuItems;
  // }

  public Iterator createIterator() {
    return new PancakeMenuIterator(menuItems);
  }
}