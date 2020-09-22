package design_patterns.visitor.element;

import java.util.*;

import design_patterns.visitor.visitor.Visitor;

public class Directory extends Entry {
  private String name;

  private ArrayList<Entry> dir = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    int size = 0;
    for (Entry entry : dir) {
      size += entry.getSize();
    }
    return size;
  }

  public Entry add(Entry entry) {
    dir.add(entry);
    return this;
  }

  public ArrayList dir() {
    return dir;
  }

  public void accept(Visitor visitor) { // Visitor の受入れ
    visitor.visit(this);
  }
}