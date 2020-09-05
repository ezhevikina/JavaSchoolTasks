package com.ezhevikina.basics.homework3;

/**
 * Создайте пример наследования, реализуйте класс Student и класс
 * Aspirant, аспирант отличается от студента наличием некой научной работы.
 *
 * Класс Student содержит переменные: String firstName, lastName,
 * group. А также double averageMark, содержащую среднюю оценку.
 *
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 *
 * Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 100, иначе 80.
 * Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.
 *
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.
 */

public class Task3 {

  public static void main(String[] args) {

    Student aspirant = new Aspirant(
        "Аспирант",
        "Аспирантович",
        "Группа аспирантов",
        5.0,
        "Научная работа о всяком"
        );
    Student student = new Student(
        "Студент",
        "Студентович",
        "Группа студентов",
        3.5
    );
    Student[] students = {student, aspirant};
    for (Student s : students) {
      System.out.println(s.getScholarship());
    }
  }
}
