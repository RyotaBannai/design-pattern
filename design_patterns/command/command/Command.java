package design_patterns.command.command;

public interface Command {
  public void execute();

  public void undo();
}