package design_patterns.mediator.colleague;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

import design_patterns.mediator.mediator.Mediator;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
  private Mediator mediator;

  public ColleagueTextField(String text, int columns) {
    super(text, columns);
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
    setBackground(enabled ? Color.white : Color.lightGray);
  }

  public void textValueChanged(TextEvent e) { // TextListener interface
    mediator.colleagueChanged();
  }
}