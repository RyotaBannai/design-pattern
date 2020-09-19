package design_patterns.state.state;

import design_patterns.state.GumballMachine;

public class WinnerState implements State {
  GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
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
    System.out.println("You're Winner!ガムが二つ出ます");
    gumballMachine.releaseBall();

    if (gumballMachine.getCount() > 0) {
      gumballMachine.releaseBall();
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        gumballMachine.setState(gumballMachine.getSoldOutStateState());
      }
    } else {
      System.out.println("Ops, sorry gumball just sold out!!");
      gumballMachine.setState(gumballMachine.getSoldOutStateState());
    }
  };
}