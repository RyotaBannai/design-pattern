package design_patterns.state.state;

import design_patterns.state.GumballMachine;

public class SoldOutState implements State {
  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("申し訳ありません。ガムボールは売り切れです");
  };

  public void ejectQuarter() {
    System.out.println("申し訳ありません。25 cent は投入されていません");
  };

  public void turnCrank() {
    System.out.println("申し訳ありません。ガムボールは売り切れです");
  };

  public void dispense() {
    System.out.println("申し訳ありません。ガムボールは売り切れです");
  }
}