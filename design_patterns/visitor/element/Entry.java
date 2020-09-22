package design_patterns.visitor.element;

import java.util.Iterator;
import design_patterns.visitor.exception.FileTreatmentException;

public abstract class Entry implements Element {
  abstract String getName();

  abstract int getSize();

  Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  Iterator iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  }
}