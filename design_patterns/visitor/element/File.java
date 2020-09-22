package design_patterns.visitor.element;

import design_patterns.visitor.visitor.Visitor;

public class File extends Entry {
  private String name;
  private int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  @Override
  public void accept(Visitor visitor) { // Visitor の受入れ
    visitor.visit(this);
  }
}