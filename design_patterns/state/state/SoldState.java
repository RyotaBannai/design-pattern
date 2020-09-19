package design_patterns.state.state;

import design_patterns.state.GumballMachine;

public class SoldState implements State {
  GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("お待ちください。ガムを出しています");
  };

  public void ejectQuarter() {
    System.out.println("申し訳ありません。すでにクランクを回しています");
  };

  public void turnCrank() {
    System.out.println("２買い回してもガムボールは１つしか出ません。");
    dispense();
  };

  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldOutStateState());
    }
  };
}