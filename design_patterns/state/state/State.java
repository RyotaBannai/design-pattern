package design_patterns.state.state;

public interface State {

  public void insertQuarter();

  public void ejectQuarter();

  public void turnCrank();

  public void dispense();
}