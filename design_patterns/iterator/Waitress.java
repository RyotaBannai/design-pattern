package design_patterns.iterator;

import java.util.ArrayList;

import design_patterns.iterator.iterator.Iterator;
import design_patterns.iterator.menu.DinerMenu;
import design_patterns.iterator.menu.PancakeHouseMenu;
import design_patterns.iterator.menu.MenuItem;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator dinerIterator = dinerMenu.createIterator();

    System.out.println("\n<<< Pancake Menu >>>");
    printMenu(pancakeIterator);
    System.out.println("\n<<< Diner Menu >>>");
    printMenu(dinerIterator);
  }

  public void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName());
      System.out.println(menuItem.getDescription());
      System.out.println(menuItem.getPrice());
    }
  }

}