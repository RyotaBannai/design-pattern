package design_patterns.composite;

import java.util.Iterator;

import design_patterns.composite.composite.MenuComponent;

public class Waitress {
  MenuComponent menuComponents;

  public Waitress(MenuComponent menuComponents) {
    this.menuComponents = menuComponents;
  }

  public void printMenu() {
    menuComponents.print();
  }

  public void printVegetarianMenu() {
    Iterator iterator = menuComponents.createIterator();
    System.out.println(">>> Vegetarian Menu");
    while (iterator.hasNext()) {
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      try {
        if (menuComponent.isVegetarian()) {
          menuComponent.print();
        }
      } catch (UnsupportedOperationException e) {
      }
    }
  }
}