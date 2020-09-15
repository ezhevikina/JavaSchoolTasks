package com.ezhevikina.basics.homework5.task2.datastorage;

public class GamerDataStorage extends DataStorage {

  public GamerDataStorage() {
    setType("SSD");
    setManufacturer("Производитель классных накопителей");
    setFormFactor(100);
  }

  @Override
  public void printInfo() {
    System.out.print("Емкий, быстрый ");
    super.printInfo();
  }
}
