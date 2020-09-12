package com.ezhevikina.basics.homework4.task2;

public class SportCar extends Car {

  private int maxSpeed;

  public SportCar(String model, String carClass, int weight, int maxSpeed) {
    super(model, carClass, weight);
    this.maxSpeed = maxSpeed;
  }

  @Override
  public void stop() {
    System.out.println("SportCar остановился");
  }

  @Override
  public void start() {
    System.out.println("SportCar поехал");
  }

  @Override
  public String getInfo() {
      String info = String.format(
          "SportCar. Модель %s, класс %s, вес %d т, максимальная скорость %d км/ч. Мотор мощностью %d л.c., марки %s",
          this.getModel(),
          this.getCarClass(),
          this.getWeight(),
          this.maxSpeed,
          this.getEngine().getCapacity(),
          this.getEngine().getManufacturer());
      return info;
    }
}
