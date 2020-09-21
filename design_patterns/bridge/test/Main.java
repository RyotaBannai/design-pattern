package design_patterns.bridge.test;

import design_patterns.bridge.feature.*;
import design_patterns.bridge.implement.StringDisplayImpl;

public class Main {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("hello world"));
    Display d2 = new CountDisplay(new StringDisplayImpl("hello world"));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello world"));

    d1.display();
    d2.display();
    d3.multiDisplay(2);
  }
}