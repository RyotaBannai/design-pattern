package design_patterns.composite.test;

import design_patterns.composite.Waitress;
import design_patterns.composite.composite.Menu;
import design_patterns.composite.composite.MenuComponent;
import design_patterns.composite.composite.MenuItem;

public class MenuTestDrive {
  public static void main(String[] args) {
    MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
    MenuComponent dinerMenu = new Menu("Restaurant Menu", "Lunch");
    MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
    MenuComponent desertMenu = new Menu("Desert Menu", "Desert");

    MenuComponent menus = new Menu("Menus", "All menues");

    menus.add(pancakeHouseMenu);
    menus.add(dinerMenu);
    menus.add(cafeMenu);

    pancakeHouseMenu.add(new MenuItem("K&B Pancake", "スクランブルエッグとトーストが付いたパンケーキ", 2.99, false));
    pancakeHouseMenu.add(new MenuItem("Blueberry Pancake", "新鮮なブルベリーで作ったパンケーキ", 3.49, true));
    dinerMenu.add(new MenuItem("Vegetarian BLT", "レタス、トマト、ベーコンを挟んだサンドイッチ", 2.99, false));
    dinerMenu.add(desertMenu);
    cafeMenu.add(new MenuItem("Hotdog", "レリッシュを使用したソフトフランス", 2.80, false));
    desertMenu.add(new MenuItem("Baked Cheese", "定番のベイクドチーズケーキ", 3.80, true));
    desertMenu.add(new MenuItem("Waffle", "秋らしい素材のモンブランを使用したもっちりワッフル", 3.20, true));

    Waitress waitress = new Waitress(menus);
    // waitress.printMenu();
    waitress.printVegetarianMenu();
  }

}