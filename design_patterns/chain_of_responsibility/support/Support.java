package design_patterns.chain_of_responsibility.support;

import design_patterns.chain_of_responsibility.trouble.Trouble;

public abstract class Support {
  private String name;
  private Support next;

  public Support(String name) {
    this.name = name;
  }

  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  // 再帰によるたらい回し
  // public final void support(Trouble trouble) {
  // if (resolve(trouble)) {
  // done(trouble);
  // } else if (next != null) {
  // next.support(trouble);
  // } else {
  // fail(trouble);
  // }
  // }

  // loop によるたらい回し
  public final void support(Trouble trouble) {
    for (Support obj = this; true; obj = obj.next) {
      if (obj.resolve(trouble)) {
        done(trouble);
        break;
      } else if (obj.next == null) {
        fail(trouble);
        break;
      }
    }
  }

  protected abstract boolean resolve(Trouble trouble);

  protected void done(Trouble trouble) {
    System.out.println(trouble + " is resolved by " + name + ".");
  }

  protected void fail(Trouble trouble) {
    System.out.println(trouble + " cannot be resolved.");
  }
}