package design_patterns.composite.composite;

public abstract class MenuComponent {
  /** 操作メソッド と呼ばれる */
  public String getName() {
    throw new UnsupportedOperationException();
  };

  public String getDescription() {
    throw new UnsupportedOperationException();
  };

  public Double getPrice() {
    throw new UnsupportedOperationException();
  };

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  };

  public void print() {
    throw new UnsupportedOperationException();
  };

  /** add, remove, getChild は Composite methods と呼ばれる */
  public void add(MenuComponent component) {
    throw new UnsupportedOperationException();
  };

  public void remove(MenuComponent component) {
    throw new UnsupportedOperationException();
  };

  public void getChild(int i) {
    throw new UnsupportedOperationException();
  };
}