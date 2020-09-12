package com.ezhevikina.basics.homework3.task1;

public class Horse extends Animal {

  private String riderName;

  public Horse(String food, String location, String riderName) {
    super(food, location);
  }

  @Override
  public void makeNoise() {
    System.out.println("Ржет");
  }

  @Override
  public void eat() {
    System.out.println("Ест лошадиную еду");
  }

  @Override
  public void sleep() {
    System.out.println("Видит лошадиные сны");
  }
}
