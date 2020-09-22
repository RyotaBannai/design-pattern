package design_patterns.mediator.test;

import java.awt.*;
import design_patterns.mediator.mediator.LoginFrame;

public class Main {
  public static void main(String[] args) {
    Frame frame = new LoginFrame("Mediator Sample");
    frame.setVisible(true);
  }
}