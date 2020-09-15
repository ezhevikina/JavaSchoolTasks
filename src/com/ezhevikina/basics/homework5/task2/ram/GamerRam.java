package com.ezhevikina.basics.homework5.task2.ram;

public class GamerRam extends Ram {

  public GamerRam() {
    setManufacturer("производитель игровых ОЗУ");
    setFrequency(100);
    setMemory(100);
    setType("DDR3");
  }

  @Override
  public void printInfo() {
    System.out.print("Быстрое ОЗУ. ");
    super.printInfo();
  }
}
