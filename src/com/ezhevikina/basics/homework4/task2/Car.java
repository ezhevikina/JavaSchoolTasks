package com.ezhevikina.basics.homework4.task2;

/**
 *     Создать абстрактный класс класс Car, и класс Engine
 *     Класс Engine содержит поля - мощность, производитель.
 *     Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine.
 *     Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()
 *     Методы turnRight() и turnLeft() выводят на экран: "Поворот направо" или "Поворот налево".
 *     Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе.
 *     Создать производный от Car класс - **Lorry** (грузовик), характеризуемый также
 *     грузоподъемностью кузова, реализовать методы start(), stop(). Метод start – выводит на экран
 *     «Грузовик поехал», метод stop - «грузовик остановился».
 *     Создать производный от Car класс - **SportCar**, характеризуемый также
 *     предельной скоростью start(), stop(). Метод start – выводит на экран «SportCar поехал»,
 *     метод stop - «SportCar остановился».
 **/

public abstract class Car {

  private String model;
  private String carClass;
  private int weight;
  private Engine engine;

  public Car(String model, String carClass, int weight) {
    this.model = model;
    this.carClass = carClass;
    this.weight = weight;
  }

  public String getModel() {
    return model;
  }

  public String getCarClass() {
    return carClass;
  }

  public int getWeight() {
    return weight;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(int capacity, String manufacturer) {
    this.engine = new Engine(capacity, manufacturer);
  }

  public abstract void stop();

  public abstract void start();

  public void turnRight() {
    System.out.println("Поворот направо");
  }

  public void turnLeft() {
    System.out.println("Поворот налево");
  }

  public abstract String getInfo();

  public class Engine {
    private int capacity;
    private String manufacturer;

    public Engine(int capacity, String manufacturer) {
      this.capacity = capacity;
      this.manufacturer = manufacturer;
    }

    public int getCapacity() {
      return capacity;
    }

    public String getManufacturer() {
      return manufacturer;
    }
  }
}
