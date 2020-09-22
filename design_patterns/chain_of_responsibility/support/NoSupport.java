package design_patterns.chain_of_responsibility.support;

import design_patterns.chain_of_responsibility.trouble.Trouble;

public class NoSupport extends Support {
  public NoSupport(String name) {
    super(name);
  }

  @Override
  public boolean resolve(Trouble trouble) {
    return false;
  }
}