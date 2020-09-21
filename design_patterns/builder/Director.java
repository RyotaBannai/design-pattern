package design_patterns.builder;

import design_patterns.builder.builder.Builder;

public class Director {
  /* 建造物をどのように構築するかを決める.concrete method 特有のメソッドに依存してはいけない. builder のメソッドのみ呼び出す. */
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  /** make buildings */
  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("From the morning to the evening");
    builder.makeItems(new String[] { "Good Morning.", "Good Evening." });
    builder.makeString("At night");
    builder.makeItems(new String[] { "Good Evening", "Good Night", "Goodbye" });
    builder.close();
  }
}