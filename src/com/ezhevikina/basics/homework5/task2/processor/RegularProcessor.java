package com.ezhevikina.basics.homework5.task2.processor;

public class RegularProcessor extends Processor {

  public RegularProcessor() {
    setCoreSpeed(10);
    setCores(10);
    setCache(10);
    setName("процессор");
    setManufacturer("Производитель обычных процессоров");
  }

  @Override
  public void printInfo() {
    System.out.print("Обычный медленный ");
    super.printInfo();
  }
}
