package com.ezhevikina.basics.homework5.task2.ram;

public abstract class Ram {

  private String manufacturer;
  private int memory;
  private int frequency;
  private String type;

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setMemory(int memory) {
    this.memory = memory;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void printInfo() {
    System.out.println(String.format(
        "Производитель: %s, объем памяти: %d, частота: %d, тип: %s",
        manufacturer,
        memory,
        frequency,
        type));
  }
}
