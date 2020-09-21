package design_patterns.bridge.feature;

import design_patterns.bridge.feature.Display;
import design_patterns.bridge.implement.DisplayImpl;

public class CountDisplay extends Display {
  /** 機能のクラスの階層 */
  public CountDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void multiDisplay(int times) {
    open();
    for (int i = 0; i < times; i++) {
      print();
    }
    close();
  }
}