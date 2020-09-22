package design_patterns.visitor.exception;

public class FileTreatmentException extends RuntimeException {
  public FileTreatmentException() {
  }

  public FileTreatmentException(String msg) {
    super(msg);
  }
}