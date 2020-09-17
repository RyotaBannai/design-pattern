package design_patterns.template_method.test;

import java.util.Arrays;

import design_patterns.template_method.comparable.Duck;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = { new Duck("Darfie", 8), new Duck("Duwy", 2), new Duck("Howard", 7), };
    System.out.println("<<< Before sort >>>");
    display(ducks);
    System.out.println("<<< After sort >>>");
    Arrays.sort(ducks);
    display(ducks);
  }

  public static void display(Duck[] ducks) {
    for (Duck duck : ducks) {
      System.out.println(duck);
    }
  }
}