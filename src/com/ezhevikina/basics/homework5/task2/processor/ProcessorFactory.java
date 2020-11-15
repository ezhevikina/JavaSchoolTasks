package com.ezhevikina.basics.homework5.task2.processor;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComponentFactory;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class ProcessorFactory extends ComponentFactory {
  @Override
  public Component addComponent(ComputerType computerType) {
    return new Processor(computerType);
  }
}
