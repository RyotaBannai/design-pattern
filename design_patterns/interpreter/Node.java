package design_patterns.interpreter;

// Abstract Expression: implements the interpret (parse) method
public abstract class Node {
  public abstract void parse(Context context) throws ParseException;
}