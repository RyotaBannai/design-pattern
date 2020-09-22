package design_patterns.visitor.visitor;

import design_patterns.visitor.element.*;

public abstract class Visitor {
  public abstract void visit(File file);

  public abstract void visit(Directory directoyr);

}