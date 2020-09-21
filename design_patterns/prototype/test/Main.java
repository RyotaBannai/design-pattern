package design_patterns.prototype.test;

import design_patterns.prototype.Manager;
import design_patterns.prototype.products.*;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    UnderlinePen upen = new UnderlinePen('~');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');

    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);

    /* インスタンスのコピーを行う処理をカプセル化しているため、manager は単に create を呼び出すだけで良い */
    Product p1 = manager.create("strong message");
    p1.use("Prototype pattern");
    Product p2 = manager.create("warning box");
    p2.use("Prototype pattern");
    Product p3 = manager.create("slash box");
    p3.use("Prototype pattern");
  }
}