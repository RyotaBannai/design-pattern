package design_patterns.memento;

import java.util.*;

public class Memento {
  int money;
  ArrayList<String> fruits = new ArrayList<>();

  Memento(int money) { // package scope // wide interface
    this.money = money;
  }

  public int getMoney() { // narrow interface
    return money;
  }

  void addFruit(String fruit) { // wide interface
    fruits.add(fruit);
  }

  ArrayList getFruits() { // wide interface
    return (ArrayList) fruits.clone();
  }
}