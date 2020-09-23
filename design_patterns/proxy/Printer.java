package design_patterns.proxy;

import java.io.IOException;
import java.util.stream.IntStream;

// import com.github.jknack.handlebars.*;

public class Printer implements Printable {
  private String name;

  public Printer() {
    heavyJob("Printer のインスタンス作成中...");
  }

  public Printer(String name) {
    this.name = name;
    // Handlebars handlebars = new Handlebars();
    // try {
    // Template template = handlebars.compileInline("Printer のインスタンス {{name}}
    // 作成中...");
    // System.out.println(template.apply(name));
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    heavyJob(String.format("Printer のインスタンス %s 作成中...", name));
  }

  public void setPrinterName(String name) {
    this.name = name;
  }

  @Override
  public void print(String str) {
    System.out.println("=== " + name + " ===");
    System.out.println(str);
  }

  public String getPrinterName() {
    return name;
  }

  public void heavyJob(String msg) {
    System.out.println(msg);
    IntStream.range(0, 5).forEach(i -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(".");
      }
    });
    System.out.println("Done");
  }
}