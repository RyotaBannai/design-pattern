package design_patterns.visitor.test;

import design_patterns.visitor.element.*;
import design_patterns.visitor.exception.FileTreatmentException;
import design_patterns.visitor.visitor.*;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootDir = new Directory("root");
      Directory binDir = new Directory("bin");
      Directory tmpDir = new Directory("tmp");
      Directory usrDir = new Directory("usr");
      Directory goLangDir = new Directory("Golang");

      rootDir.add(binDir);
      rootDir.add(tmpDir);
      rootDir.add(usrDir);
      binDir.add(goLangDir);
      binDir.add(new File("vi", 10000));
      binDir.add(new File("latex", 20000));
      goLangDir.add(new File("bin", 50000));

      rootDir.accept(new ListVisitor());

      System.out.println("");
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}