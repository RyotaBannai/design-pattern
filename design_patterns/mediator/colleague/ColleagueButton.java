package design_patterns.mediator.colleague;

import java.awt.*;

import design_patterns.mediator.mediator.Mediator;

public class ColleagueButton extends Button implements Colleague {
  private Mediator mediator;

  public ColleagueButton(String caption) {
    super(caption);
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled); // An enabled component can respond to user input and generate events.
  }
}