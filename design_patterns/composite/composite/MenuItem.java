package design_patterns.composite.composite;

import java.util.Iterator;

import design_patterns.composite.iterator.NullIterator;

public class MenuItem extends MenuComponent {
  String name;
  String description;
  double price;
  boolean vegetarian;

  public MenuItem(String name, String description, double price, boolean vegetarian) {
    /** leaf */

    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
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
  public Double getPrice() {
    return price;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public void print() {
    System.out.print(getName());
    if (isVegetarian()) {
      System.out.print("(v)");
    }
    System.out.println("、" + getPrice());
    System.out.println(" -- " + getDescription());
  }

  @Override
  public Iterator createIterator() {
    return new NullIterator();
  }
}