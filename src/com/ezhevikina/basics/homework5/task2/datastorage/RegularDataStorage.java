package com.ezhevikina.basics.homework5.task2.datastorage;

public class RegularDataStorage extends DataStorage {

  public RegularDataStorage() {
    setType("HDD");
    setManufacturer("Производитель обычных накопителей");
    setFormFactor(10);
  }

  @Override
  public void printInfo() {
    System.out.print("Обычный ");
    super.printInfo();
  }
}
