package design_patterns.iterator.test;

import design_patterns.iterator.Waitress;
import design_patterns.iterator.menu.DinerMenu;
import design_patterns.iterator.menu.PancakeHouseMenu;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}