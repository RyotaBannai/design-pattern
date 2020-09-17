package design_patterns.iterator_api;

import java.util.ArrayList;
import java.util.Iterator;

import design_patterns.iterator_api.menu.MenuItem;
import design_patterns.iterator_api.menu.Menu;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
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