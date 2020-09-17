package design_patterns.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
  public void brew() {
    System.out.println("Brewing coffee");
  }

  public void addCondiments() {
    System.out.println("Adding sugar and milk into coffee");
  }

  @Override
  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

  public String getUserInput() {
    String answer = null;
    System.out.println("Do you want sugar and milk? (y/n)");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.out.println("IO error");
    }

    if (answer == null) {
      return "no";
    }
    return answer;
  }
}