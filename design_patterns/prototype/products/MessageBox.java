package design_patterns.prototype.products;

public class MessageBox extends Product {
  private char decochar; // e.g. *, /

  public MessageBox(char decochar) {
    this.decochar = decochar;
  }

  public void use(String s) {
    int length = s.getBytes().length;
    this.printDecocharLine(length);
    System.out.println(decochar + " " + s + " " + decochar);
    this.printDecocharLine(length);
  }

  private void printDecocharLine(int length) {
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
  }
}