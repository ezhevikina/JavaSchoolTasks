package com.ezhevikina.basics.homework5.task2.datastorage;

import com.ezhevikina.basics.homework5.task2.ComputerType;

public class DataStorageFactory {

  public DataStorage addDataStorage(ComputerType computerType) {
    if (computerType == ComputerType.GAMER) {
      return new GamerDataStorage();
    } else if (computerType == ComputerType.OFFICE) {
      return new RegularDataStorage();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
