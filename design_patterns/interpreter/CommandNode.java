package design_patterns.interpreter;

// <command> ::= <repeat command> | <primitive command>
public class CommandNode extends Node {
  private Node node;

  public void parse(Context context) throws ParseException {
    if (context.currentToken().equals("repeat")) {
      node = new RepeatCommandNode();
      node.parse(context);
    } else {
      node = new PrimitiveNode();
      node.parse(context);
    }
  }

  public String toString() {
    return node.toString();
  }
}