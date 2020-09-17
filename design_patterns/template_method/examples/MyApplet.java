package design_patterns.template_method.examples;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
  String message;

  public void init() {
    message = "Hello guys, I'm still alive!";
    repaint();
  }

  public void start() {
    message = "Launching ...";
    repaint();
  }

  public void stop() {
    message = "Stopping ...";
    repaint();
  }

  public void destroy() {
    message = "Destroying Applet ...";
  }

  public void pain(Graphics g) {
    g.drawString(message, 5, 15);
  }
}