package design_patterns.prototype.products;

public abstract class Product implements Cloneable {
  /**
   * Cloneable interface を継承. Cloneable は marker interface と呼ばれる
   */
  public abstract void use(String s);

  /** 自分自身の複製を作成するメソッド */
  public Product createClone() {
    Product p = null;
    try {
      // error handling just in case instance doesn't have clone method
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }
}