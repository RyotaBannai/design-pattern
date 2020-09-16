package design_patterns.command.command;

import design_patterns.command.vender.Light;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }

  public void undo() {
    light.off();
  }
}