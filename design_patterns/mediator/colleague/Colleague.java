package design_patterns.mediator.colleague;

import design_patterns.mediator.mediator.Mediator;

public interface Colleague {
  // 相談役への参照を保持
  abstract void setMediator(Mediator mediator);

  // Colleague が自分の仕事をするべきかどうかを相談役が決めるための抽象メソッド
  abstract void setColleagueEnabled(boolean enabled);
}