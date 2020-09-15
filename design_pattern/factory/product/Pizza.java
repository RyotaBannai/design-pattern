package design_pattern.factory.product;

import java.util.ArrayList;

public abstract class Pizza {
  protected String name;
  protected String dough;
  protected String sauce;
  protected ArrayList<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println(name + "を下処理" + name);
    System.out.println("生地をこねる");
    System.out.println("ソースを追加");
    System.out.println("トッピングを追加");
    for (String topping : toppings) {
      System.out.println(" " + topping);
    }
  }

  public void bake() {
    System.out.println("350 度で25 分間焼く");
  }

  public void cut() {
    System.out.println("ピザを菱形に切り分ける");
  }

  public void box() {
    System.out.println("PizzaStore の正式な箱にピザをいれる");
  }

  public String getName() {
    return name;
  }
}