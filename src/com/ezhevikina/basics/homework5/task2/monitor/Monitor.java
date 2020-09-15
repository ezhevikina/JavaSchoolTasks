package com.ezhevikina.basics.homework5.task2.monitor;

public abstract class Monitor {

  private int diagonal;

  public void setDiagonal(int diagonal) {
    this.diagonal = diagonal;
  }

  public void printInfo() {
    System.out.println(String.format("монитор с диагональю %d\"", diagonal));
  }
}
