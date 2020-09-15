package com.ezhevikina.basics.homework5.task2.monitor;

public class RegularMonitor extends Monitor {

  public RegularMonitor() {
    setDiagonal(10);
  }

  @Override
  public void printInfo() {
    System.out.print("Обычный ");
    super.printInfo();
  }
}
