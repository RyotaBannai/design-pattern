package design_pattern.command.command;

import design_pattern.command.vender.Garage;

public class GarageDoorOpenCommand implements Command {
  Garage garage;

  public GarageDoorOpenCommand(Garage garage) {
    this.garage = garage;
  }

  public void execute() {
    garage.lightOn();
  }
}