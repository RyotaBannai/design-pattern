package design_pattern.command.test;

import design_pattern.command.controller.SimpleRemoteController;
import design_pattern.command.vender.Light;
import design_pattern.command.command.LightOnCommand;
import design_pattern.command.command.LightOffCommand;

public class RemoteControllerTest {
  /** client */
  public static void main(String[] args) {
    SimpleRemoteController remote = new SimpleRemoteController(); // invoker
    Light light = new Light(); // receiver
    LightOnCommand lightOn = new LightOnCommand(light); // pass receiver to command
    LightOffCommand lightOff = new LightOffCommand(light);
    remote.setCommand(0, lightOn, lightOff);
    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
  }
}