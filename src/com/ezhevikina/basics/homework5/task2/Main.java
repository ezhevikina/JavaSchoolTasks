package com.ezhevikina.basics.homework5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Спроектировать класс компьютер с характеристиками: класс
 * процессор, оперативная память, видеокарта, накопитель, монитор.
 * Характеристики процессора: тактовая чистота, кол-во ядер, кеш
 * память, название, производитель. Характеристики оперативной
 * памяти: производитель, объем памяти, частота, тип памяти.
 * Характеристики видеокарты: производитель, тип памяти, объем
 * памяти, охлаждение(активное или пассивное). Характеристики
 * накопителя: производитель, объем памяти, тип накопителя(HDD илиSSD), форм-фактор.
 * Для усложнения можно создать несколько классов наследников
 * для процессора, оперативной памяти, видеокарты, накопителя.
 * Создания экземпляров классов характеристик использоватьфабричный метод и стратегию.
 */

public class Main {
  public static void main(String[] args) throws IOException {

    Computer computer;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Context context = new Context();
    System.out.println("Какой компютер собрать: офисный или игровой?\n(OFFICE / GAMER): ");

    try {
      switch (ComputerType.valueOf(reader.readLine())) {
        case GAMER:
          context.setStrategy(new BuildGamerComputer());
          computer = context.build();
          break;
        case OFFICE:
          context.setStrategy(new BuildOfficeComputer());
          computer = context.build();
          break;
        default:
          throw new IllegalArgumentException();
      }
      computer.printInfo();
    } catch (IllegalArgumentException e) {
      System.out.println("Не понятно :(");
    }
  }
}
