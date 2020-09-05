package com.ezhevikina.basics.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson31082020 {

  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {

    System.out.println("\nЗадание 1");
    printLastDigit();

    System.out.println("\nЗадание 2");
    findSumOfDigits();

    System.out.println("\nЗадание 3");
    addOneIfPositive();

    System.out.println("\nЗадание 4");
    transformNumberOnCondition();

    System.out.println("\nЗадание 5");
    printMinNumber();

    System.out.println("\nЗадание 6");
    describeNumber();

    System.out.println("\nЗадание 7");
    getCallPrice();

    System.out.println("\nЗадание 8");
    getInfoAboutArray();

    System.out.println("\nЗадание 9");
    printArrayBackwards();

    System.out.println("\nЗадание 10");
    bringZerosToTheEndOfArray();

    reader.close();
  }

  /**
   * задание 1: ввести целое число в консоли и вывести на экран последнюю цифру введенного числа
   **/
  private static void printLastDigit() throws IOException {

    int number = getInt();
    String s = Integer.toString(number);
    System.out.println("Последняя цифра: " + s.charAt(s.length() - 1));
  }

  /**
   * задание 2: ввести целое трехзначное число в консоли и найти сумму цифр этого числа
   **/
  private static void findSumOfDigits() throws IOException {

    int number = get3DigitInt();
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += Integer.parseInt(
          String.valueOf(
              Integer.toString(number)
                  .charAt(i)));
    }
    System.out.println("Сумма цифр: " + sum);
  }

  /**
   * задание 3: ввести целое число в консоли. если оно является положительным, то
   * прибавить к нему 1, в противном случае не изменять его. Вывести полученное чсло
   **/
  private static void addOneIfPositive() throws IOException {

    Integer number = getInt();
    if (number > 0) {
      System.out.println(number + " + 1: " + (++number));
    } else {
      System.out.println(number);
    }
  }

  /**
   * задание 4: ввести целое число в консоли. если оно является положительным,
   * то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым,
   * то заменить его на 10. вывести полученное число
   **/
  private static void transformNumberOnCondition() throws IOException {

    int number = getInt();
    if (number > 0) {
      System.out.println(number + " + 1: " + (++number));
    } else if (number < 0) {
      System.out.println(number + " - 2: " + (number - 2));
    } else {
      number = 10;
      System.out.println(number);
    }
  }

  /**
   * задание 5: ввести три целых числа с консоли. вывести на экран наименьшее из них
   **/
  private static void printMinNumber() throws IOException {

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 3; i++) {
      int number = getInt();
      if (number < min) {
        min = number;
      }
    }
    System.out.println("Наименьшее: " + min);
  }

  /**
   * задание 6: ввести целое число в консоли. вывести его строку-описание вида
   * "отрицательное четное число" и т.д.
   **/
  private static void describeNumber() throws IOException {

    StringBuilder description = new StringBuilder();
    int number = getInt();

    if (number == 0) {
      System.out.println("Ноль");
    } else {
      if (number > 0) {
        description.append("Положительное ");
      } else {
        description.append("Отрицательное ");
      }

      if (number % 2 == 0) {
        description.append("четное число");
      } else {
        description.append("нечетное число");
      }
      System.out.println(description);
    }
  }

  /**
   * задание 7: написать программу, вычисляющую стоимость междугороднего разговора
   * в зависимости от кода города
   **/
  private static void getCallPrice() throws IOException {

    int number = get3DigitInt();
    switch (number) {
      case 905:
        System.out.println("Москва. Стоимость разговора: 41.5");
        break;
      case 491:
        System.out.println("Ростов. Стоимость разговора: 19.8");
        break;
      case 194:
        System.out.println("Краснодар. Стоимость разговора: 26.9");
        break;
      case 800:
        System.out.println("Киров. Стоимость разговора: 50.0");
        break;
      default:
        System.out.println("Неизвестный код города");
        break;
    }
  }

  /**
   * задание 8: дан массив целых чисел. вывести на экран: максимальное значение,
   * сумму положительных элементов, сумму четных отрицательных элементов,
   * количество положительных элементов, среднее арифметическое отрицательных элементов
   **/
  private static void getInfoAboutArray() {

    int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
    int max = array[0];
    int sumPositive = 0, positiveCount = 0;
    int sumNegative = 0, negativeCount = 0, sumNegativeEven = 0;

    for (int value : array) {
      if (value > max) {
        max = value;
      }
      if (value > 0) {
        sumPositive += value;
        positiveCount++;
      }
      if (value < 0) {
        sumNegative += value;
        negativeCount++;
        if (value % 2 == 0) {
          sumNegativeEven += value;
        }
      }
    }

    System.out.println("Максимальное: " + max);
    System.out.println("Сумма положительных: " + sumPositive);
    System.out.println("Сумма четных отрицательных: " + sumNegativeEven);
    System.out.println("Кол-во положительных: " + positiveCount);
    System.out.println("Среднее арифметическое отрицательных: " + ((double) sumNegative / negativeCount));
  }

  /**
   * задание 9: дан массив целых чисел. переставить элементы массива в обратном порядке. вывести
   * результат в консоль
   **/
  private static void printArrayBackwards() {

    int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, 52};
    int[] backwards = new int[array.length];

    for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
      backwards[i] = array[j];
      System.out.print(backwards[i] + " ");
    }
  }

  /**
   * задание 10: дан массив целых чисел. переместить нули в конец массива. вывести результат в консоль
   **/
  private static void bringZerosToTheEndOfArray() {

    int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
    int[] newArray = new int[array.length];

    for (int i = 0, j = 0; i < array.length; i++) {
      if (array[i] != 0) {
        newArray[j] = array[i];
        j++;
      }
    }

    for (int value : newArray) {
      System.out.print(value + " ");
    }
  }

  private static boolean isInt(String input) {

    try {
      Integer.parseInt(input);
      return true;
    } catch (NumberFormatException e) {
      System.out.println("Введено не целое число");
      return false;
    }
  }

  private static int getInt() throws IOException {

    System.out.println("Введите целое число");
    while (true) {
      String line = reader.readLine();
      if (isInt(line)) {
        return Integer.parseInt(line);
      }
    }
  }

  private static int get3DigitInt() throws IOException {

    while (true) {
      System.out.println("Введите целое трехзначное число");
      String line = reader.readLine();
      if (isInt(line)) {
        if (line.length() == 3) {
          return Integer.parseInt(line);
        } else {
          System.out.println("Введено не трехзначное число");
        }
      }
    }
  }
}
