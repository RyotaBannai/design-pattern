package design_patterns.interpreter;

// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends Node {
  private int number;
  private Node commandListNode;

  public void parse(Context context) throws ParseException {
    context.skipToken("repeat");
    number = context.currentNumber();
    context.nextToken(); // next command after take the number of repeat
    commandListNode = new CommandListNode();
    commandListNode.parse(context);
  }

  public String toString() {
    return "[repeat" + number + " " + commandListNode + "]";
  }
}