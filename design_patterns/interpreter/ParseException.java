package design_patterns.interpreter;

public class ParseException extends Exception {
  public ParseException(String msg) {
    super(msg);
  }
}