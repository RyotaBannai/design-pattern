package design_patterns.visitor.visitor;

import java.util.*;

import design_patterns.visitor.element.*;

public class ListVisitor extends Visitor {
  // データ構造を渡り歩きながら、一覧を表示するためのクラス
  private String currentDir = "";

  public void visit(File file) {
    System.out.println(currentDir + "/" + file);
  }

  public void visit(Directory directory) {
    System.out.println(currentDir + "/" + directory);
    String saveDir = currentDir;
    currentDir = currentDir + "/" + directory.getName();

    ArrayList<Entry> dir = directory.dir();
    for (Entry entry : dir) {
      entry.accept(this); // pass this with modified currentDir value
    }
    currentDir = saveDir;
  }
}