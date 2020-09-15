package com.ezhevikina.basics.homework5.task1;

public class FileLoggerFactory extends LoggerFactory {
  @Override
  public Logger createLog() {
    return new FileLogger();
  }
}
