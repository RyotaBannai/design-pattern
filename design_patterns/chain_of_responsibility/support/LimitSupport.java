package design_patterns.chain_of_responsibility.support;

import design_patterns.chain_of_responsibility.trouble.Trouble;

public class LimitSupport extends Support {
  private int limit;

  public LimitSupport(String name, int limit) {
    super(name);
    this.limit = limit;
  }

  @Override
  public boolean resolve(Trouble trouble) {
    if (trouble.getNumber() < limit) {
      return true;
    } else {
      return false;
    }
  }
}