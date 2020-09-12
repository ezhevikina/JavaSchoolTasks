package com.ezhevikina.basics.homework4.task1;

/**
 * Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
 * Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
 */

public class Main {
  public static void main(String[] args) {
    Shape[] shape = new Shape[3];
    shape[0] = new Triangle(3.0, 4.5, 1.8);
    shape[1] = new Circle(2.8);
    shape[2] = new Rectangle(1.2, 3.7);

    for (Shape sh: shape) {
      System.out.println("Площадь фигуры: " + sh.square());
    }
  }
}
