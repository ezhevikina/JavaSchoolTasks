package com.ezhevikina.basics.homework4.task2;

public class Lorry extends Car {

  private int carryingCapacity;

  public Lorry(String model, String carClass, int weight, int carryingCapacity) {
    super(model, carClass, weight);
    this.carryingCapacity = carryingCapacity;
  }

  @Override
  public void stop() {
    System.out.println("Грузовик остановился");
  }

  @Override
  public void start() {
    System.out.println("Грузовик поехал");
  }

  @Override
  public String getInfo() {
    String info = String.format(
        "Грузовик. Модель %s, класс %s, вес %d т, грузоподъемность %d т. Мотор мощностью %d л.c., марки %s",
        this.getModel(),
        this.getCarClass(),
        this.getWeight(),
        this.carryingCapacity,
        this.getEngine().getCapacity(),
        this.getEngine().getManufacturer());
    return info;
  }
}
