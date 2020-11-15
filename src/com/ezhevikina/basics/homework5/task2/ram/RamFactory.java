package com.ezhevikina.basics.homework5.task2.ram;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComponentFactory;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class RamFactory extends ComponentFactory {
  @Override
  public Component addComponent(ComputerType computerType) {
    return new Ram(computerType);
  }
}
