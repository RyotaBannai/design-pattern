package design_patterns.proxy.test;

import design_patterns.proxy.Printable;
import design_patterns.proxy.PrinterProxy;

public class Main {
  public static void main(String[] args) {
    // PrinterProxy 経由で Printer を使用する
    Printable p = new PrinterProxy("Alice", "design_patterns.proxy.Printer");
    System.out.println(p.getPrinterName());
    p.setPrinterName("Bob");
    System.out.println("The name is " + p.getPrinterName());
    p.print("Hello World");
  }
}