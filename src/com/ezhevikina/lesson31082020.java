package com.ezhevikina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class lesson31082020 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;

    //задание 1: ввести целое число в консоли и вывести на экран последнюю цифру введенного числа

    boolean goOn = true;
    System.out.println("\nЗадание 1");
    while (goOn) {
      System.out.println("Введите целое число");
      line = reader.readLine();
      try {
        Integer.parseInt(line);
        System.out.println("Последняя цифра: " + (line.charAt(line.length() - 1)));
        goOn = false;
      } catch (NumberFormatException e) {}
    }

    //задание 2: ввести целое трехзначное число в консоли и найти сумму цифр этого числа

    goOn = true;
    System.out.println("\nЗадание 2");
    while (goOn) {
      System.out.println("Введите целое трехзначное число");
      line = reader.readLine();
      if (line.length() > 3) continue;
      try {
        int number = Integer.parseInt(line);
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
          sum += Integer.parseInt(String.valueOf(line.charAt(i)));
          goOn = false;
        }
        System.out.println("Сумма цифр (хоть и не просили выводить): " + sum);
      } catch (NumberFormatException e) {}
    }

    //задание 3: ввести целое число в консоли. если оно является положительным, то
    //прибавить к нему 1, в противном случае не изменять его. Вывести полученное чсло

    goOn = true;
    System.out.println("\nЗадание 3");
    while (goOn) {
      System.out.println("Введите целое число");
      try {
        Integer number = Integer.parseInt(reader.readLine());
        if (number > 0) {
          System.out.println(number + " + 1: " + (++number));
        } else {
          System.out.println(number);
        }
        goOn = false;
      } catch (NumberFormatException e) {}
    }

    //задание 4: ввести целое число в консоли. если оно является положительным,
    //то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым,
    //то заменить его на 10. вывести полученное число

    goOn = true;
    System.out.println("\nЗадание 4");
    while (goOn) {
      System.out.println("Введите целое число");
      try {
        Integer number = Integer.parseInt(reader.readLine());
        if (number > 0) {
          System.out.println(number + " + 1: " + (++number));
        } else if (number < 0){
          System.out.println(number + " - 2: " + (number - 2));
        } else {
          number = 10;
          System.out.println(number);
        }
        goOn = false;
      } catch (NumberFormatException e) {}
    }

    //задание 5: ввести три положительных числа с консоли. вывести на экран наименьшее из них

    goOn = true;
    System.out.println("\nЗадание 5");
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      while (goOn) {
        System.out.println("Введите целое число");
        try {
          Integer number = Integer.parseInt(reader.readLine());
          arrayList.add(number);
          goOn = false;
        } catch (NumberFormatException e) {
        }
      }
      goOn = true;
    }
    System.out.println("Наименьшее: " + Collections.min(arrayList));

    //задание 6: ввести целое число в консоли. вывести его строку-описание вида
    //"отрицательное четное число" и т.д.

    goOn = true;
    System.out.println("\nЗадание 6");
    while (goOn) {
      System.out.println("Введите целое число");
      String description = new String();
      try {
        Integer number = Integer.parseInt(reader.readLine());

        if (number > 0) {
          description = description.concat("Положительное ");
        } else if (number < 0) {
          description = description.concat("Отрицательное ");
        } else {
          System.out.println("Ноль");
          break;
        }

        if (number % 2 == 0) {
          description = description.concat("четное ");
        } else {
          description = description.concat("нечетное ");
        }

        System.out.println(description + "число");
        goOn = false;
      } catch (NumberFormatException e) {}
    }

    //задание 7: написать прогрумму, вычисляющую стоимость междугороднего разговора
    //в зависимости от кода города

    goOn = true;
    System.out.println("\nЗадание 7");
    for (int i = 0; i < 3; i++) {
      while (goOn) {
        System.out.println("Введите трехзначный код города");
        line = reader.readLine();
        if (line.length() > 3) continue;
        try {
          Integer number = Integer.parseInt(line);
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
          }
          goOn = false;
        } catch (NumberFormatException e) {
        }
      }
    }

    reader.close();

    //задание 8: дан массив целых чисел. вывести на экран: минимальное значение,
    //сумму положительных элементов, сумму четных отрицательных элементов,
    //количество положительных элементов, среднее арифметическое отрицательных элементов

    System.out.println("\nЗадание 8");
    ArrayList<Integer> array = new ArrayList(Arrays.asList(1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2));
    System.out.println(array);
    System.out.println("Минимальное: " + Collections.min(array));
    ArrayList<Integer> positive = new ArrayList<>();
    ArrayList<Integer> negative = new ArrayList<>();
    int sumPositive = 0, sumNegative = 0, sumNegativeEven = 0;
    for (Integer i : array) {
      if (i > 0) {
        positive.add(i);
        sumPositive += i;
      }
      else if (i < 0) {
        negative.add(i);
        sumNegative += i;
        if (i % 2 == 0) sumNegativeEven += i;
      }
    }
    System.out.println("Сумма положительных: " + sumPositive);
    System.out.println("Сумма четных отрицательных: " + sumNegativeEven);
    System.out.println("Кол-во положительных: " + positive.size());
    System.out.println("Среднее арифметическое отрицательных: " + ((double) sumNegative / negative.size()));

    //задание 9: дан массив целых чисел. переставить элементы массива в обратном порядке. вывести
    //результат в консоль

    System.out.println("\nЗадание 9");
    ArrayList<Integer> array1 = new ArrayList(Arrays.asList(
        15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, 52));
    System.out.println(array1);
    ArrayList<Integer> backwards = new ArrayList<>();
    for (int i = array1.size() - 1; i >= 0; i--) {
      backwards.add(array1.get(i));
    }
    System.out.println(backwards);

    //задание 10: дан массив целых чисел. переместить нули в конец массива. вывести результат в консоль

    System.out.println("\nЗадание 10");
    ArrayList<Integer> array2 = new ArrayList(Arrays.asList(
        15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52));
    System.out.println(array2);
    int sumOfZeros = 0;
    for (int z : array2) {
      if (z == 0) sumOfZeros++;
    }
    for (int i = 0; i < array2.size() - sumOfZeros;) {
      int poi = array2.get(i);
      if (poi == 0) {
        array2.remove(i);
        array2.add(poi);
      } else i++;
    }
    System.out.println(array2);
  }
}
