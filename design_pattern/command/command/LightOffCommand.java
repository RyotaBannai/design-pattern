package design_pattern.command.command;

import design_pattern.command.vender.Light;

public class LightOffCommand implements Command {
  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}