package com.ezhevikina.basics.homework5.task2.monitor;

public class GamerMonitorFactory extends MonitorFactory {

  @Override
  public Monitor addMonitor() {
    return new GamerMonitor();
  }
}
