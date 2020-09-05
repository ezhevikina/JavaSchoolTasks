package com.ezhevikina.basics.homework3;

public class Dog extends Animal {

  private int fleasCount;

  public Dog(String food, String location, int fleasCount) {
    super(food, location);
    this.fleasCount = fleasCount;
  }

  @Override
  public void makeNoise() {
    System.out.println("Лает");
  }

  @Override
  public void eat() {
    System.out.println("Ест собачью еду");
  }

  @Override
  public void sleep() {
    System.out.println("Видит собачьи сны");
  }
}
