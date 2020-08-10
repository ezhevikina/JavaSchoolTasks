package com.ezhevikina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
  private static final Pattern pattern = Pattern.compile("/|\\*|[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");

  public static void main(String[] args) throws IOException {
    boolean goOn = true;
    LinkedList<String> numbersAndSigns = new LinkedList<>();

    while (goOn) {
      System.out.println("Введите выражение и нажмите [Enter]:");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String input = reader.readLine();

      if (input.isEmpty()) {
        System.out.println("Ошибка: пустой ввод");
      } else {

        input = input.replaceAll("[ |\\t]", ""); // очистить от пробелов и табуляции
        numbersAndSigns = trimInputFromInvalidChars(input);

        String clearedInput = "";
        for (String numbersAndSign : numbersAndSigns) {
          clearedInput = clearedInput.concat(numbersAndSign);
        }

        String diff = difference(input, clearedInput);
        if (!diff.isEmpty()) {
          System.out.println("Ошибка: ввод содержит недопустимые символы " + diff);
        } else goOn = false;
      }
    }

    TrimMultipliesAndDivisionsFromTheEnds(numbersAndSigns);
    try {
      performDivisions(numbersAndSigns);
    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: деление на ноль");
    }
    performMultiplies(numbersAndSigns);


    LinkedList<Double> numbers = new LinkedList<>();
    for (String s : numbersAndSigns) {

      Matcher matcher = pattern.matcher(numbersAndSigns.get(numbersAndSigns.indexOf(s))); // мэтчер вычленения для double чисел и знаков +,-,/,*

      while (matcher.find()) {
        numbers.add(Double.parseDouble(matcher.group())); // лист с double числами
        System.out.println(numbers);
      }
    }

    double result = 0.0;
    for (int i = 0; i < numbers.size(); i++) {
      result += numbers.get(i);
      if (i + 1 < numbers.size()) {
        result += numbers.get(i + 1);
        i++;
      }
    }
    System.out.println("Ответ: " + result);
  }

  public static LinkedList<String> trimInputFromInvalidChars(String input) {
    Matcher matcher = pattern.matcher(input); // мэтчер вычленения для double чисел и знаков +,-,/,*
    LinkedList<String> numbersAndSigns = new LinkedList<>();

    while (matcher.find()) {
      numbersAndSigns.add(matcher.group()); // лист со знаками /,* и double числами
    }

    return numbersAndSigns;
  }

  public static LinkedList<String> TrimMultipliesAndDivisionsFromTheEnds(LinkedList<String> numbersAndSigns) {
    while (true) {
      if (numbersAndSigns.getFirst().contains("/") | numbersAndSigns.getFirst().contains("*")) {
        numbersAndSigns.removeFirst();
      } else {
        break;
      }
    }

    while (true) {
      if (numbersAndSigns.getLast().contains("/") | numbersAndSigns.getLast().contains("*")) {
        numbersAndSigns.removeLast();
      } else {
        break;
      }
    }

    return numbersAndSigns;
  }

  private static String difference(String input, String validInput) {
    if (input.equals(validInput)) {
      return "";
    }

    String unsignedInput = input.replaceAll("[-+]", "");
    String unsignedValidInput = validInput.replaceAll("[-+]", "");
    HashMap<Character, Boolean> map = new HashMap<>();

    for (char c : unsignedValidInput.toCharArray()) {
      map.put(c, false);
    }

    StringBuilder invalidInput = new StringBuilder();
    for (Character c : unsignedInput.toCharArray()) {
      if (!map.containsKey(c)) {
        invalidInput.append(c);
      }
    }

    return invalidInput.toString();
  }

  private static void performMultiplies(LinkedList<String> numbersAndSigns) {
    int lastIndex;
    Double previous, next = null;
    System.out.println(numbersAndSigns);

    while ((lastIndex = numbersAndSigns.lastIndexOf("*")) != -1) {

      System.out.println(lastIndex);
      try {
        previous = Double.parseDouble(numbersAndSigns.get(lastIndex - 1));
        try {
          next = Double.parseDouble(numbersAndSigns.get(lastIndex + 1));
        } catch (NumberFormatException e) {
          numbersAndSigns.remove(lastIndex + 1);
        }

        String multiplied = String.valueOf((previous * next));
        numbersAndSigns.remove(lastIndex + 1);
        numbersAndSigns.remove(lastIndex);
        numbersAndSigns.set(lastIndex - 1, multiplied);
        System.out.println(numbersAndSigns);

      } catch (NumberFormatException e) {
        numbersAndSigns.remove(lastIndex - 1);
      }
    }

  }

  private static void performDivisions(LinkedList<String> numbersAndSigns) {
    int lastIndex;
    Double previous, next = null;
    System.out.println(numbersAndSigns);
    while ((lastIndex = numbersAndSigns.lastIndexOf("/")) != -1) {

      System.out.println(lastIndex);
      try {
        previous = Double.parseDouble(numbersAndSigns.get(lastIndex - 1));
        try {
          next = Double.parseDouble(numbersAndSigns.get(lastIndex + 1));
        } catch (NumberFormatException e) {
          numbersAndSigns.remove(lastIndex + 1);
        }

        if (next == 0.0) throw new IllegalArgumentException();
        String s = String.valueOf((previous / next));
        numbersAndSigns.remove(lastIndex + 1);
        numbersAndSigns.remove(lastIndex);
        numbersAndSigns.set(lastIndex - 1, s);
        System.out.println(numbersAndSigns);


      } catch (NumberFormatException e) {
        numbersAndSigns.remove(lastIndex - 1);
      }
    }
  }
}

