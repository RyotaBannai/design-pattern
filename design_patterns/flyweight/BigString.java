package design_patterns.flyweight;

import java.util.stream.IntStream;

public class BigString {
  private BigChar[] bigChars;

  public BigString(String str) {
    bigChars = new BigChar[str.length()];
    final BigCharFactory factory = BigCharFactory.getInstance();
    IntStream.range(0, bigChars.length).forEach(i -> {
      bigChars[i] = factory.getBigChar(str.charAt(i));
    });
  }

  public void print() {
    IntStream.range(0, bigChars.length).forEach(i -> {
      bigChars[i].print();
    });
  }
}