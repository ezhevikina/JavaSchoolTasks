package com.ezhevikina.basics.homework5.task2.monitor;

public class GamerMonitor extends Monitor {

  public GamerMonitor() {
    setDiagonal(100);
  }

  @Override
  public void printInfo() {
    System.out.print("Большой ");
    super.printInfo();
  }
}
