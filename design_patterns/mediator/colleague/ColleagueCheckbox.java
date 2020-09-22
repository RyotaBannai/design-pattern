package design_patterns.mediator.colleague;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import design_patterns.mediator.colleague.Colleague;
import design_patterns.mediator.mediator.Mediator;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
  private Mediator mediator;

  public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
    super(caption, group, state);
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged();
  }
}