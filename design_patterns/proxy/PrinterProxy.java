package design_patterns.proxy;
import java.lang.Class;

public class PrinterProxy implements Printable {
  private String name;
  private Printable real;
  private String className;

  public PrinterProxy() {
  }

  public PrinterProxy(String name, String className) {
    this.name = name;
    this.className = className;
  }

  public synchronized void setPrinterName(String name) {
    if (real != null) {
      real.setPrinterName(name);
    }
    this.name = name;
  }

  public String getPrinterName() {
    return name;
  }

  public void print(String str) {
    realize();
    real.print(str);
  }

  // call the heavy job when the real is really in need. To get printer's name
  // doesn't require the REAL printer, so proxy does it instead
  public synchronized void realize() {
    if (real == null) {
      // real = new Printer(name);
      try{
        real = (Printable) Class.forName(className).newInstance();
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}