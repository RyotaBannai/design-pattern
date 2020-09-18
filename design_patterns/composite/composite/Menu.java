package design_patterns.composite.composite;

public class Menu extends MenuComponent {
  MenuComponent[] menuComponents;

  @Override
  public String getName() {
    return this.getName();
  }

  @Override
  public String getDescription() {
    return "Menu";
  }

  @Override
  public void print() {
    System.out.println("Print");
  }

  @Override
  public void add(MenuComponent component) {
    // TODO Auto-generated method stub

  }

  @Override
  public void remove(MenuComponent component) {
    // TODO Auto-generated method stub

  }

  @Override
  public void getChild(int i) {
    // TODO Auto-generated method stub

  }
}