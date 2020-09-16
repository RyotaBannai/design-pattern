package design_pattern.command.controller;

import design_pattern.command.command.Command;
import design_pattern.command.command.NoCommand;

public class SimpleRemoteController {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;

  public SimpleRemoteController() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (Command command : onCommands)
      command = noCommand;
    for (Command command : offCommands)
      command = noCommand;

    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPressed(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPressed(int slot) {
    offCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void undoButtonWasPressed() {
    undoCommand.undo();
  }

  public String toStirng() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n----- リモコン -----\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append(
          "[スロット" + i + "]" + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuff.toString();
  }

}