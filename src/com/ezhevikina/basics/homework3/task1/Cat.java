package com.ezhevikina.basics.homework3.task1;

public class Cat extends Animal {

  private int miceCaught;

  public Cat(String food, String location, int miceCaught) {
    super(food, location);
    this.miceCaught = miceCaught;
  }

  @Override
  public void makeNoise() {
    System.out.println("Мяукает");
  }

  @Override
  public void eat() {
    System.out.println("Ест кошачью еду");
  }

  @Override
  public void sleep() {
    System.out.println("Видит кошачьи сны");
  }
}
