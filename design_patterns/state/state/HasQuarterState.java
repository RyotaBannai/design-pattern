package design_patterns.state.state;

import java.util.Random;

import design_patterns.state.GumballMachine;

public class HasQuarterState implements State {
  GumballMachine gumballMachine;
  Random randomWinner = new Random(System.currentTimeMillis());

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("すでに 25 cent が投入されています");
  };

  public void ejectQuarter() {
    System.out.println("25 cent を取り出しました");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  };

  public void turnCrank() {
    System.out.println("クランクを回しました...");
    int winner = randomWinner.nextInt(10);
    if (winner == 0 && gumballMachine.getCount() > 1) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  };

  public void dispense() {
    System.out.println("販売するガムボールはありません");
  };
}