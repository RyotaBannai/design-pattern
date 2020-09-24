package design_patterns.interpreter.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;

import design_patterns.interpreter.Context;
import design_patterns.interpreter.Node;
import design_patterns.interpreter.ProgramNode;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("./design_patterns/interpreter/program/program.txt"));
      String text;
      while ((text = reader.readLine()) != null) {
        System.out.println("text = \"" + text + "\"");
        Node node = new ProgramNode();
        node.parse(new Context(text));
        System.out.println("node = " + node);
      }
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}