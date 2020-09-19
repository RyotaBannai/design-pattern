package design_patterns.state;

public class GumballMachine {
  /** Possible states */
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_QUARTER;
    }
  }

  /** Actions - 遷移 */
  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("すでに投入されています");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("25 cent を投入しました");
    } else if (state == SOLD_OUT) {
      System.out.println("ガムは売り切れです");
    } else if (state == SOLD) {
      System.out.println("ガムを出しています。完了までお待ちください。");
    }
  }

  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      state = NO_QUARTER;
      System.out.println("25 cent を返却しました");
    } else if (state == NO_QUARTER) {
      System.out.println("まだ 25 cent を投入していません");
    } else if (state == SOLD_OUT) {
      System.out.println("ガムは売り切れです。まだ 25 cent を投入していません");
    } else if (state == SOLD) {
      System.out.println("ガムを出しています。25 cent を返却できません");
    }
  }

  public void turnCrank() {
    if (state == HAS_QUARTER) {
      state = SOLD;
      System.out.println("ガムを購入しました");
    } else if (state == NO_QUARTER) {
      System.out.println("先に 25 cent を投入して下さい");
    } else if (state == SOLD_OUT) {
      System.out.println("ガムは売り切れです");
    } else if (state == SOLD) {
      System.out.println("２回回してもガムは１つしか出ません");
      dispense();
    }
  }

  public void dispense() {
    /* ガムを販売状態・売り切れに戻すために呼び出す */
    if (state == HAS_QUARTER) { // 起こりえないがエラーのときの処理
      System.out.println("ガムは売り切れです");
    } else if (state == NO_QUARTER) { // 起こりえないがエラーのときの処理
      System.out.println("まず支払いが必要です");
    } else if (state == SOLD_OUT) { // 起こりえないがエラーのときの処理
      System.out.println("ガムは売り切れです");
    } else if (state == SOLD) {
      System.out.println("ガムがスロットから転がり出てきます");
      count -= 1;
      if (count > 0) {
        state = NO_QUARTER;
      } else {
        System.out.println("ガムが売れ切れました");
      }
    }
  }

  public void refill(int count) {
    this.count += count;
  }

  public int getCount() {
    return state;
  }
}