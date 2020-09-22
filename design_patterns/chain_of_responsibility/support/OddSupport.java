package design_patterns.chain_of_responsibility.support;

import design_patterns.chain_of_responsibility.trouble.Trouble;

public class OddSupport extends Support {
  public OddSupport(String name) {
    super(name);
  }

  public boolean resolve(Trouble trouble) {
    if (trouble.getNumber() % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
}