package design_patterns.Memento.test;

import design_patterns.Memento.Gamer;
import design_patterns.Memento.Memento;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Gamer gamer = new Gamer(100);
    Memento memento = gamer.createMemento();

    for (int i = 0; i < 200; i++) {
      System.out.println("===" + i);
      System.out.println("Current:" + gamer);

      gamer.bet();
      System.out.println("Money: " + gamer.getMoney());

      if (gamer.getMoney() > memento.getMoney()) {
        System.out.println("You got increased lots of money let's save now.");
        memento = gamer.createMemento();
      } else if (gamer.getMoney() < memento.getMoney() / 2) {
        System.out.println("You're losing money. let's restore the snapshot.");
        gamer.restoreMemento(memento);
      }

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
      }
      System.out.println("");
    }
  }
}