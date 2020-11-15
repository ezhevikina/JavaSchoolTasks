package com.ezhevikina.basics.homework5.task2.datastorage;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComponentFactory;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class DataStorageFactory extends ComponentFactory {
  @Override
  public Component addComponent(ComputerType computerType) {
    return new DataStorage(computerType);
  }
}
