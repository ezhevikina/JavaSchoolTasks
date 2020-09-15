package com.ezhevikina.basics.homework5.task2.videocard;

public abstract class VideoCard {
  private String manufacturer;
  private String type;
  private int memory;
  private String coolingType;

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setMemory(int memory) {
    this.memory = memory;
  }

  public void setCoolingType(String coolingType) {
    this.coolingType = coolingType;
  }

  public void printInfo() {
    System.out.println(String.format(
        "видеокарта. Производитель: %s, тип памяти: %s, объем памяти: %d, охлаждение: %s",
        manufacturer,
        type,
        memory,
        coolingType));
  }
}
