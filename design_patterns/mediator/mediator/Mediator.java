package design_patterns.mediator.mediator;

public interface Mediator {
  // Mediator が colleague を作成する
  abstract void createColleagues();

  // colleague が呼び出すメソッド
  abstract void colleagueChanged();
}