package com.ezhevikina.basics.homework4.task1;

public class Rectangle implements Shape {
  private double height;
  private double width;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double square() {
    return height * width;
  }
}
