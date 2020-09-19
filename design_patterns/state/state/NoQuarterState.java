package design_patterns.state.state;

import design_patterns.state.GumballMachine;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("25 cent を投入しました");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  };

  public void ejectQuarter() {
    System.out.println("25 cent を投入していません");
  };

  public void turnCrank() {
    System.out.println("クランクを回しましたが、25 cent が投入されていません");
  };

  public void dispense() {
    System.out.println("まず支払いをする必要があります");
  };
}