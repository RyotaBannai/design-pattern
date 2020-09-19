package design_patterns.state.test;

import design_patterns.state.GumballMachine;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine machine = new GumballMachine(5);

    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine.getCount());
    machine.insertQuarter();
    machine.turnCrank();

    System.out.println(machine.getCount());
  }
}