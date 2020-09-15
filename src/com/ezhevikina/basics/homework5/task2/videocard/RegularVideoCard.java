package com.ezhevikina.basics.homework5.task2.videocard;

public class RegularVideoCard extends VideoCard {

  public RegularVideoCard() {
    setManufacturer("Производитель обычных видеокарт");
    setType("обычная");
    setCoolingType("пассивное");
    setMemory(10);
  }

  @Override
  public void printInfo() {
    System.out.print("Обычная ");
    super.printInfo();
  }
}
