package com.ezhevikina.basics.homework5.task1;

public class ConsoleLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println(String.format("Log into console: %s", message));
  }
}
