package com.ezhevikina.basics.homework5.task2.processor;

public abstract class Processor {
  private int coreSpeed;
  private int cores;
  private int cache;
  private String name;
  private String manufacturer;

  public void setCoreSpeed(int coreSpeed) {
    this.coreSpeed = coreSpeed;
  }

  public void setCores(int cores) {
    this.cores = cores;
  }

  public void setCache(int cache) {
    this.cache = cache;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void printInfo() {
    System.out.println(String.format(
        "%s. Производитель: %s, тактовая частота: %d, ядер: %d, кэш: %d",
        name,
        manufacturer,
        coreSpeed,
        cores,
        cache));
  }

}
