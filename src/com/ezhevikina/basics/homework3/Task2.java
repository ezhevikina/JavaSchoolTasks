package com.ezhevikina.basics.homework3;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы
 * makeNoise, eat, sleep. Метод makeNoise, например, может выводить
 * на консоль "Такое-то животное спит". Dog, Cat, Horse
 * переопределяют методы makeNoise, eat. Добавьте переменные в
 * классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void
 * treatAnimal(Animal animal). Пусть этот метод распечатывает food и
 * location пришедшего на прием животного. В методе main создайте
 * массив типа Animal, в который запишите животных всех имеющихся
 * у вас типов. В цикле отправляйте их на прием к ветеринару.
 */

public class Task2 {

  public static void main(String[] args) {

    Cat cat = new Cat("Кошачья еда", "На диване", 2);
    Dog dog = new Dog("Собачья еда", "На улице", 10);
    Horse horse = new Horse("Лошадиная еда", "На ипподроме", "Наездник Петр");
    
    Animal[] animals = {cat, dog, horse};
    for (Animal animal : animals) {
      Veterinarian.treatAnimal(animal);
    }
  }
}
