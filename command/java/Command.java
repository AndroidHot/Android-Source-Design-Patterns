package io.github.androidhot.command.java;

public interface Command {
  void execute();
  void undo();
  void redo();
}
