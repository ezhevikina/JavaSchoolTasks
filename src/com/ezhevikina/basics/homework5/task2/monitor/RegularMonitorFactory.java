package com.ezhevikina.basics.homework5.task2.monitor;

public class RegularMonitorFactory extends MonitorFactory {

  @Override
  public Monitor addMonitor() {
    return new RegularMonitor();
  }
}
