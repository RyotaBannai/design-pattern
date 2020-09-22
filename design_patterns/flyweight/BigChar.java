package design_patterns.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
  // Flyweight because the file size is huge therefore this have to be shared as
  // the same instance.
  private char charName;
  private String fontData;

  public BigChar(char charName) {
    this.charName = charName;
    try {
      String fileName = "./design_patterns/flyweight/big_chars/big" + charName + ".txt";
      BufferedReader reader = new BufferedReader(new FileReader(fileName));
      String line;
      StringBuffer buf = new StringBuffer();
      while ((line = reader.readLine()) != null) {
        buf.append(line + "\n");
      }
      reader.close();
      this.fontData = buf.toString();
    } catch (IOException e) {
      this.fontData = charName + "?";
    }
  }

  public void print() {
    System.out.println(fontData);
  }

}