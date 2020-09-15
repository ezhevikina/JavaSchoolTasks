package com.ezhevikina.basics.homework5.task1;

/**
 * С помощью фабричного метода реализуйте логирование. Есть
 * три логера: ConsoleLogger, FileLogger, DbLogger. Логгер должен
 * реализовать метод log(String message) . Все логгеры пишут в к
 * консоль следующее:
 * ConsoleLogger
 * – Log into console: {message}
 * FileLogger
 * – Log into file: {message}
 * DbLogger
 * – Log into database: {message}
 * Реализуйте класс калькулятор с методами умножения, деления,
 * вычитания и сложения. Добавьте в каждый метод логирование
 * полученного результата
 */

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator(new DbLoggerFactory().createLog());
    calculator.calculate();
  }
}
