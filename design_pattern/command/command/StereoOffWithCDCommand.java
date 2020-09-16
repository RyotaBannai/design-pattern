
package design_pattern.command.command;

import design_pattern.command.vender.Stereo;

public class StereoOffWithCDCommand implements Command {
  Stereo stereo;

  public StereoOffWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }

  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume();
  }
}