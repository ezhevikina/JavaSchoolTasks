package com.ezhevikina;

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
        if (n < 0) throw new IllegalArgumentException("Ошибка: введено отрицательное количество точек подачи");

        r = Integer.parseInt(numbersFromInput[1]);
        if (r > 10e9)
          throw new IllegalArgumentException("Ошибка: максимальное расстояние до рекомендованной точки не должно превышать 10^9");
        if (r < 0)
          throw new IllegalArgumentException("Ошибка: введено отрицательное расстояние до рекомандованной точки");

        System.out.println(formatter.format("Введите %d точ%s подачи:", n, pointSuffix(n)));
        input = reader.readLine();
        numbersFromInput = input.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersFromInput.length; i++) {
          numbers.add(Integer.parseInt(numbersFromInput[i]));
        }
        Collections.sort(numbers);

        countPOI(numbers, r);

      } catch (NumberFormatException e) {
        System.out.println("Ошибка: некорректный ввод. Укажите целые числа последовательно через пробел");
      } catch (IllegalArgumentException ei) {
        System.out.println(ei.getMessage());
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

      for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) <= poi + r) {
          numbersDuplicate.remove(Integer.valueOf(numbers.get(i)));
        } else break;
      }

      pois.add(poi);
      numbers = numbersDuplicate;
    }

    System.out.println(pois.size());
  }
}
