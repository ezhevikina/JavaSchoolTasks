package com.ezhevikina.basics.homework5.task1;

public class DbLoggerFactory extends LoggerFactory {
  @Override
  public Logger createLog() {
    return new DbLogger();
  }
}
