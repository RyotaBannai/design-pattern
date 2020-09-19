package design_patterns.state;

import design_patterns.state.state.*;

public class GumballMachine {
  /** Possible states */
  State soldOutState;
  State soldState;
  State noQuarterState;
  State hasQuarterState;
  State winnerState;

  State state = soldOutState;
  int count = 0;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    soldState = new SoldState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (this.count > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
  }

  public void releaseBall() {
    System.out.println("ガムが出てきます");
    if (count != 0) {
      count -= 1;
    }
  }

  public void setState(State state) { // 他のオブジェクトが machine を他の状態へ遷移させることができる
    this.state = state;
  }

  public State getSoldOutStateState() {
    return soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public int getCount() {
    return count;
  }

}