package design_patterns.command.test;

import design_patterns.command.controller.SimpleRemoteController;
import design_patterns.command.vender.*;
import design_patterns.command.command.*;

public class RemoteControllerTest {
  /** client */
  public static void main(String[] args) {
    SimpleRemoteController remote = new SimpleRemoteController(); // invoker
    Light light = new Light(); // receiver
    Stereo stereo = new Stereo();
    LightOnCommand lightOn = new LightOnCommand(light); // pass receiver to command
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
    StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
    NoCommand noCommand = new NoCommand();
    /** create Macro */
    Command[] partyOn = { lightOn, stereoOn };
    Command[] partyOff = { lightOff, stereoOff };
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
    remote.setCommand(0, lightOn, lightOff);
    remote.setCommand(1, stereoOn, noCommand);
    remote.setCommand(2, partyOnMacro, partyOffMacro);
    // remote.onButtonWasPressed(0);
    // remote.offButtonWasPressed(0);
    // remote.onButtonWasPressed(1);
    // remote.undoButtonWasPressed();
    remote.onButtonWasPressed(2);
    remote.offButtonWasPressed(2);

  }
}