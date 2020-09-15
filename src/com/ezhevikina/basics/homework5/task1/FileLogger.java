package com.ezhevikina.basics.homework5.task1;

public class FileLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println(String.format("Log into file: %s", message));
  }
}
