package design_patterns.builder.builder;

public class TextBuilder implements Builder {
  private StringBuffer buffer = new StringBuffer();

  public void makeTitle(String title) {
    buffer.append("==========\n");
    buffer.append("\"" + title + "\"");
    buffer.append("\n");
  }

  public void makeString(String str) {
    buffer.append('■' + str + "\n");
    buffer.append("\n");
  }

  public void makeItems(String[] items) {
    for (String item : items) {
      buffer.append("  ・" + item + "\n");
    }
    buffer.append("\n");
  }

  public void close() {
    buffer.append("==========\n");
  }

  public String getResult() {
    return buffer.toString();
  }
}