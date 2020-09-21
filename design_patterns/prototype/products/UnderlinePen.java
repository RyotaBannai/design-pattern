package design_patterns.prototype.products;

public class UnderlinePen extends Product {
  private char ulchar; // e.g. ~

  public UnderlinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  public void use(String s) {
    int length = s.getBytes().length;
    System.out.println("\"" + s + "\"");
    this.printUnderline(length);
  }

  private void printUnderline(int length) {
    System.out.print(" ");
    for (int i = 0; i < length; i++) {
      System.out.print(ulchar);
    }
    System.out.println("");
  }

}