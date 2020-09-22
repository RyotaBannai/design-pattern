package design_patterns.visitor.element;

import design_patterns.visitor.visitor.Visitor;

public interface Element { // visitor の訪問先
  void accept(Visitor visitor);
}