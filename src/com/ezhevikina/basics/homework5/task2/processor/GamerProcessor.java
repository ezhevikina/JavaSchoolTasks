package com.ezhevikina.basics.homework5.task2.processor;

public class GamerProcessor extends Processor {

  public GamerProcessor() {
    setCoreSpeed(100);
    setCores(100);
    setCache(100);
    setName("игровой процессор");
    setManufacturer("Производитель игровых процессоров");
  }

  @Override
  public void printInfo() {
    System.out.print("Быстрейший, новейший ");
    super.printInfo();
  }
}
