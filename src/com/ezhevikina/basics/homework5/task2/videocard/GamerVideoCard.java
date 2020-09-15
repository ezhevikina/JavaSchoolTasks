package com.ezhevikina.basics.homework5.task2.videocard;

public class GamerVideoCard extends VideoCard {

  public GamerVideoCard() {
    setManufacturer("Производитель игровых видеокарт");
    setType("игровая");
    setCoolingType("активное");
    setMemory(100);
  }

  @Override
  public void printInfo() {
    System.out.print("Игровая ");
    super.printInfo();
  }
}
