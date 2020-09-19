package com.ezhevikina.basics.homework6.task2;

import java.util.ArrayList;

/**
 * Даны классы Fruit -> Apple, Orange;
 * Класс Box, в который можно складывать фрукты. Коробки условно
 * сортируются по типу фрукта, поэтому в одну коробку нельзя сложить
 * и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать
 * собственную коллекцию;
 * Сделать метод getWeight(), который высчитывает вес коробки.
 * Задать вес одного фрукта и их количество: вес яблока – 1.0f,
 * апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод Compare, который позволяет
 * сравнить текущую коробку с той, которую подадут в Compare в
 * качестве параметра. True – если их массы равны, False в
 * противоположном случае. Можно сравнивать коробки с яблоками и
 * апельсинами;
 * * Написать метод, который позволяет пересыпать фрукты из текущей
 * коробки в другую. Помним про сортировку фруктов: нельзя яблоки
 * высыпать в коробку с апельсинами. Соответственно, в текущей
 * коробке фруктов не остается, а в другую перекидываются объекты,
 * которые были в первой;
 */

public class Box {

  private ArrayList<Fruit> box = new ArrayList<>();
  private Fruit fruit;
  private float weight;

  public Box(Fruit fruit, int amount) {
    this.fruit = fruit;
    for (int i = 0; i < amount; i++) {
      box.add(fruit);
    }
  }

  public ArrayList<Fruit> getBox() {
    return box;
  }

  public int countFruitsInBox() {
    return box.size();
  }

  public Fruit getFruit() {
    return fruit;
  }

  public float getWeight() {
    return fruit.getWeight() * box.size();
  }

  public boolean compare(Box anotherBox) {
    return this.getWeight() == anotherBox.getWeight();
  }

  public void moveToAnotherBox(Box anotherBox) {
    if (this.fruit.getClass()
        .equals(anotherBox.getFruit().getClass())) {
      for (int i = 0; i < box.size(); i++) {
        anotherBox.getBox().add(fruit);
      }
    } else {
      System.out.println(String.format("Нельзя смешивать %s и %s",
          this.fruit.getClass().getSimpleName(),
          anotherBox.getFruit().getClass().getSimpleName()));
    }
  }
}
