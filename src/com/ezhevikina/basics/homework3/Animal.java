package com.ezhevikina.basics.homework3;

public abstract class Animal {

  private String food;
  private String location;

  public Animal(String food, String location) {
    this.food = food;
    this.location = location;
  }

  public String getFood() {
    return food;
  }

  public String getLocation() {
    return location;
  }

  public abstract void makeNoise();

  public abstract void eat();

  public abstract void sleep();
}
