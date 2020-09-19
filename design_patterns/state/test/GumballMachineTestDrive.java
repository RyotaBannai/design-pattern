package design_patterns.state.test;

import design_patterns.state.GumballMachine;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine machine = new GumballMachine(2);

    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.ejectQuarter();
    machine.turnCrank();

    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.ejectQuarter();

    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    machine.dispense();

    System.out.println(machine.getCount());
  }
}