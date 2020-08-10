package com.ezhevikina;

import java.util.Formatter;

public class Seconds {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Ошибка: количество секунд не было указано при запуске программы.");
      System.exit(0);
    }

    String param = args[0];
    Formatter formatter = new Formatter();

    try {
      int seconds = Integer.parseInt(param);
      if (seconds < 0) throw new IllegalArgumentException();
      int hours = seconds / 3600;
      String hoursSuffix = hoursSuffix(hours);
      int minutes = (seconds - (hours * 3600)) / 60;
      String minutesSuffix = minutesSuffix(minutes);
      System.out.println(formatter.format("%d час%s, %d минут%s", hours, hoursSuffix, minutes, minutesSuffix));

    } catch (NumberFormatException e) {

      try {
        throw new IllegalArgumentException();

      } catch (IllegalArgumentException illegalElementEAsInTaskExample) {
        System.out.println(formatter.format("Ошибка: %s: Не могу преобразовать '%s' в число.",
            illegalElementEAsInTaskExample.getClass().getName(), param));
      }

    } catch (IllegalArgumentException e) {
      System.out.println(formatter.format("Ошибка: %s: Введено отрицательное количество секунд.",
          e.getClass().getName()));
    }
  }


  private static String hoursSuffix(int hours) {
    if (hours / 10 == 1 &&
        (hours % 10 == 1
            | hours % 10 == 2
            | hours % 10 == 3
            | hours % 10 == 4)) {
      return "ов";
    } else {
      switch (hours % 10) {
        case 1: {
          return "";
        }
        case 2:
        case 3:
        case 4: {
          return "а";
        }
        default:
          return "ов";
      }

    }
  }

  private static String minutesSuffix(int minutes) {
    if (minutes / 10 == 1 &&
        (minutes % 10 == 1
            | minutes % 10 == 2
            | minutes % 10 == 3)) {
      return "";
    } else {
      switch (minutes % 10) {
        case 1: {
          return "а";
        }
        case 2:
        case 3:
        case 4: {
          return "ы";
        }
        default:
          return "";
      }
    }
  }
}
