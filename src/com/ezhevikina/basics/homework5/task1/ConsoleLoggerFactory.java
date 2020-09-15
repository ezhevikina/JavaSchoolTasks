package com.ezhevikina.basics.homework5.task1;

public class ConsoleLoggerFactory extends LoggerFactory {
  @Override
  public Logger createLog() {
    return new ConsoleLogger();
  }
}
