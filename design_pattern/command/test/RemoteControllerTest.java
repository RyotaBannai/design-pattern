package design_pattern.command.test;

import design_pattern.command.controller.SimpleRemoteController;
import design_pattern.command.vender.Light;
import design_pattern.command.command.LightOnCommand;

public class RemoteControllerTest {
  /** client */
  public static void main(String[] args) {
    SimpleRemoteController remote = new SimpleRemoteController(); // invoker
    Light light = new Light(); // receiver
    LightOnCommand lightOn = new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
  }
}