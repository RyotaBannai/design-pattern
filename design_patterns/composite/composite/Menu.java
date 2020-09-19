package design_patterns.composite.composite;

import java.util.*;
import design_patterns.composite.iterator.CompositeIterator;

public class Menu extends MenuComponent {
  /** composite/node */
  ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
  String name;
  String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.println("\n" + getName());
    System.out.println(">>> " + getDescription());
    System.out.println("-----");

    /** 内部イテレータ */
    for (MenuComponent menuComponent : menuComponents) {
      menuComponent.print();
    }
  }

  @Override
  public void add(MenuComponent component) {
    menuComponents.add(component);
  }

  @Override
  public void remove(MenuComponent component) {
    menuComponents.remove(component);
  }

  @Override
  public MenuComponent getChild(int index) {
    return menuComponents.get(index);
  }

  @Override
  public Iterator createIterator() {
    return new CompositeIterator(menuComponents.iterator());
  }
}