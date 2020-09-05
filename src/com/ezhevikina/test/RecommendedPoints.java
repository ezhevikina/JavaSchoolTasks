package com.ezhevikina.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;

import static java.util.Collections.min;

public class RecommendedPoints {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    boolean goOn = true;
    int n, r;
    Formatter formatter = new Formatter();

    while (goOn) {
      try {
        System.out.println("Введите N и R: ");
        String input = reader.readLine();
        if (input.isEmpty()) {
          continue;
        }

        String[] numbersFromInput = input.split(" ");
        if (numbersFromInput.length != 2) {
          continue;
        }

        n = Integer.parseInt(numbersFromInput[0]);
        if (n > 10e5) throw new IllegalArgumentException("Ошибка: точек подачи не должно быть больше 10^5");
        if (n <= 0) throw new IllegalArgumentException("Ошибка: введите положительное количество точек подачи");

        r = Integer.parseInt(numbersFromInput[1]);
        if (r > 10e9)
          throw new IllegalArgumentException("Ошибка: максимальное расстояние до рекомендованной точки не должно превышать 10^9");
        if (r <= 0)
          throw new IllegalArgumentException("Ошибка: введите положительное расстояние до рекомандованной точки");

        System.out.println(formatter.format("Введите %d точ%s подачи:", n, pointSuffix(n)));
        input = reader.readLine();
        numbersFromInput = input.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : numbersFromInput) {
          numbers.add(Integer.parseInt(s));
        }
        Collections.sort(numbers);

        countPOI(numbers, r);

      } catch (NumberFormatException e) {
        System.out.println("Ошибка: некорректный ввод. Укажите целые числа последовательно через пробел");
        continue;
      } catch (IllegalArgumentException ei) {
        System.out.println(ei.getMessage());
        continue;
      }

      goOn = false;
    }
  }

  private static String pointSuffix(int n) {
    if (n / 10 == 1 &&
        (n % 10 == 1
            | n % 10 == 2
            | n % 10 == 3
            | n % 10 == 4)) {
      return "ек";
    } else {
      switch (n % 10) {
        case 1: {
          return "ку";
        }
        case 2:
        case 3:
        case 4: {
          return "ки";
        }
        default:
          return "ек";
      }

    }
  }

  private static void countPOI(ArrayList<Integer> numbers, int r) {
    ArrayList<Integer> pois = new ArrayList<>();
    while (numbers.size() > 0) {

      ArrayList<Integer> numbersDuplicate = new ArrayList<>(numbers);
      int left = min(numbersDuplicate);
      int poi = min(numbersDuplicate);

      for (int n : numbersDuplicate) {
        if (left >= n - r) {
          poi = n;
        } else break;
      }

      for (Integer number : numbers) {
        if (number <= poi + r) {
          numbersDuplicate.remove(number);
        } else break;
      }

      pois.add(poi);
      numbers = numbersDuplicate;
    }

    System.out.println(pois.size());
  }
}
