package design_pattern.command.controller;

import design_pattern.command.command.Command;

public class SimpleRemoteController {
  Command slot;

  public SimpleRemoteController() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }

}