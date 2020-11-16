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

public class Box<T extends Fruit> {
  private ArrayList<T> box = new ArrayList<>();

  public ArrayList<T> getBox() {
    return box;
  }

  public void addFruit(T fruit) {
    box.add(fruit);
  }

  public int size() {
    return box.size();
  }

  public float getWeight() {
    float weight = 0f;
    for (T fruit : box) {
      weight += fruit.getWeight();
    }
    return weight;
  }

  public boolean compare(Box anotherBox) {
    return this.getWeight() == anotherBox.getWeight();
  }

  public void moveToAnotherBox(Box<T> anotherBox) {
    anotherBox.getBox().addAll(this.box);
  }
}
