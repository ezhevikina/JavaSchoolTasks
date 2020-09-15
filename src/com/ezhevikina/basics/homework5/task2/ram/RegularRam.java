package com.ezhevikina.basics.homework5.task2.ram;

public class RegularRam extends Ram {

  public RegularRam() {
    setManufacturer("производитель обычных ОЗУ");
    setFrequency(10);
    setMemory(10);
    setType("DDR2");
  }

  @Override
  public void printInfo() {
    System.out.print("Обычное ОЗУ. ");
    super.printInfo();
  }
}
