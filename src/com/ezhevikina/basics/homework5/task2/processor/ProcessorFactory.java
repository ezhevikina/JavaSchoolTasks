package com.ezhevikina.basics.homework5.task2.processor;

import com.ezhevikina.basics.homework5.task2.ComputerType;

public class ProcessorFactory {

  public Processor addProcessor(ComputerType computerType) {
    if (computerType == ComputerType.GAMER) {
      return new GamerProcessor();
    } else if (computerType == ComputerType.OFFICE) {
      return new RegularProcessor();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
