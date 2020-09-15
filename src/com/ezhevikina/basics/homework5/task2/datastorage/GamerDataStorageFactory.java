package com.ezhevikina.basics.homework5.task2.datastorage;

public class GamerDataStorageFactory extends DataStorageFactory {

  @Override
  public DataStorage addDataStorage() {
    return new GamerDataStorage();
  }
}
