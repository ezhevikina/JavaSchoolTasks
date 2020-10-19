package com.ezhevikina.basics.homework5.task2.monitor;

import com.ezhevikina.basics.homework5.task2.ComputerType;

public class MonitorFactory {

  public Monitor addMonitor(ComputerType computerType) {
    if (computerType == ComputerType.GAMER) {
      return new GamerMonitor();
    } else if (computerType == ComputerType.OFFICE) {
      return new RegularMonitor();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
