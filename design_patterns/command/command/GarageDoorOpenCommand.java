package design_patterns.command.command;

import design_patterns.command.vender.Garage;

public class GarageDoorOpenCommand implements Command {
  Garage garage;

  public GarageDoorOpenCommand(Garage garage) {
    this.garage = garage;
  }

  public void execute() {
    garage.lightOn();
  }

  public void undo() {
    garage.lightOff();
  }
}