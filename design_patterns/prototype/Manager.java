package design_patterns.prototype;

import java.util.*;

import design_patterns.prototype.products.Product;

public class Manager {
  /* Client と呼ばれる */
  private HashMap showcase = new HashMap<>();

  /**
   * Manager が全ての Prototype を管理する. create method に protoName
   * を渡して、特定のインスタンスを返すようにする.
   */
  public void register(String name, Product proto) {
    showcase.put(name, proto);
  }

  public Product create(String protoName) {
    Product p = (Product) showcase.get(protoName);
    return p.createClone();
  }
}