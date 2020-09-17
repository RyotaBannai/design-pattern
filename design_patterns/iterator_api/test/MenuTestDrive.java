package design_patterns.iterator_api.test;

import design_patterns.iterator_api.Waitress;
import design_patterns.iterator_api.menu.DinerMenu;
import design_patterns.iterator_api.menu.Menu;
import design_patterns.iterator_api.menu.PancakeHouseMenu;

public class MenuTestDrive {
  public static void main(String[] args) {
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}