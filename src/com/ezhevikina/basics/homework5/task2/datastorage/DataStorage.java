package com.ezhevikina.basics.homework5.task2.datastorage;

public abstract class DataStorage {
  private String manufacturer;
  private String type;
  private int formFactor;

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setFormFactor(int formFactor) {
    this.formFactor = formFactor;
  }

  public void printInfo() {
    System.out.println(String.format(
        "накопитель. Производитель: %s, тип: %s, форм-фактор: %d",
        manufacturer,
        type,
        formFactor));
  }
}
