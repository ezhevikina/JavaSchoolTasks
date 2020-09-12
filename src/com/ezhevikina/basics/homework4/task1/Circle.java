package com.ezhevikina.basics.homework4.task1;

public class Circle implements Shape {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double square() {
    return Math.PI * radius * radius;
  }
}
