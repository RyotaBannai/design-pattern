package design_patterns.chain_of_responsibility.test;

import design_patterns.chain_of_responsibility.support.*;
import design_patterns.chain_of_responsibility.trouble.Trouble;

import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {

    // Define each responsibilities
    Support alice = new NoSupport("Alice");
    Support bob = new LimitSupport("Bob", 10);
    Support charlie = new OddSupport("Charlie");

    // Create Chain of Responsibility
    alice.setNext(bob).setNext(charlie);

    IntStream stream = IntStream.range(0, 20);
    stream.forEach(i -> {
      alice.support(new Trouble(i));
    });
  }
}