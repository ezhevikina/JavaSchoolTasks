package com.ezhevikina.basics.homework3.task2;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Создайте три экземпляра этого класса.
 * Выведите на консоль значения их переменных.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти
 * методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для
 * инициализации переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * Вызвать этот метод.
 * Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым
 * будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */

public class Main {

  public static void main(String[] args) {

    Phone phone1 = new Phone("+7 (907) 000 0000", "Nokia", 300);
    Phone phone2 = new Phone("+7 (907) 000 0001", "iPhone");
    Phone phone3 = new Phone();

    getPhoneInfo(phone1);
    getPhoneInfo(phone2);
    getPhoneInfo(phone3);

    phone1.receiveCall("Вася");
    phone2.receiveCall("Петя");
    phone3.receiveCall("Вениамин");

    phone1.receiveCall("Вася", phone2.getNumber());
    phone3.sendMessage(phone1.getNumber(), phone2.getNumber(), "+7 (907) 000 0002");
  }

  public static void getPhoneInfo(Phone phone) {
    System.out.println(String.format("Номер %s, модель %s, вес %d г.",
        phone.getNumber(), phone.getModel(), phone.getWeight()));
  }
}