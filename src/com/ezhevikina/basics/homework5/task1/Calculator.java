package com.ezhevikina.basics.homework5.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
  private double a;
  private double b;
  private char operator;
  private double result;
  private Logger logger;

  public Calculator(Logger logger) {
    this.logger = logger;
  }

  public void calculate() {
    try {
      Scanner reader = new Scanner(System.in);
      System.out.println("Введите первое число: ");
      a = reader.nextDouble();
      System.out.println("Введите второе число: ");
      b = reader.nextDouble();
      System.out.println("Введите оператор (+, -, *, /):");
      operator = reader.next().charAt(0);

      switch (operator) {
        case '+':
          sum(a, b);
          break;
        case '-':
          minus(a, b);
          break;
        case '*':
          multiply(a, b);
          break;
        case '/':
          divide(a, b);
          break;
        default:
          System.out.println("Ошибка: неизвестный оператор");
      }
    } catch (InputMismatchException e) {
      System.out.println("Ошибка: введено не число");
    }
  }

  private void sum(double a, double b) {
    result = a + b;
    logger.log(String.valueOf(result));
    System.out.println(result);
  }

  private void minus(double a, double b) {
    result = a - b;
    logger.log(String.valueOf(result));
    System.out.println(result);
  }

  private void multiply(double a, double b) {
    result = a * b;
    logger.log(String.valueOf(result));
    System.out.println(result);
  }

  private void divide(double a, double b) throws ArithmeticException {
    try {
      if (b == 0) {
        throw new ArithmeticException();
      }
      result = a / b;
      logger.log(String.valueOf(result));
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Ошибка: деление на ноль");
    }
  }
}
