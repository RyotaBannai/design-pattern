package design_patterns.builder.builder;

public interface Builder {
  /* インスタンスの各部分を作成するためのメソッドが用意されている */
  abstract void makeTitle(String title);

  abstract void makeString(String str);

  abstract void makeItems(String[] items);

  abstract void close();
}