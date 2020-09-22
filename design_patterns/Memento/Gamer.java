package design_patterns.memento;

import java.util.ArrayList;
import java.util.Random;

public class Gamer {
  // Originator
  private int money;
  private ArrayList<String> fruits = new ArrayList<>();

  private Random random = new Random();
  private static String[] fruitsNames = { "apple", "grape", "banana", "orange" };

  public Gamer(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  private String getFruit() {
    String prefix = "";
    if (random.nextBoolean()) {
      prefix = "Delicious ";
    }
    return prefix + fruitsNames[random.nextInt(fruitsNames.length)];
  }

  public void bet() {
    int dice = random.nextInt(6) + 1;
    if (dice == 1) {
      money += 100;
      System.out.println("Increase money");
    } else if (dice == 2) {
      money /= 2;
      System.out.println("Decrease money");
    } else if (dice == 6) {
      String f = getFruit();
      System.out.println(" You got a fruit " + f + " .");
      fruits.add(f);
    } else {
      System.out.println("Nothing happened");
    }
  }

  public Memento createMemento() {
    // snapshot
    // store only delicious fruits
    Memento m = new Memento(money);
    for (String fruit : fruits) {
      if (fruit.startsWith("Delicious")) {
        m.addFruit(fruit);
      }
    }
    return m;
  }

  public void restoreMemento(Memento memento) {
    // undo
    this.money = memento.money;
    this.fruits = memento.getFruits();
  }

  public String toString() {
    return "[money = " + money + ", fruits = " + fruits + "]";
  }
}