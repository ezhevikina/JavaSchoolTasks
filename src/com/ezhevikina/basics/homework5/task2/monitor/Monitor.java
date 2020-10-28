package com.ezhevikina.basics.homework5.task2.monitor;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class Monitor implements Component {
  private int diagonal;

  public Monitor(ComputerType computerType) {

    if (computerType == ComputerType.GAMER) {
      this.diagonal = 100;
    } else if (computerType == ComputerType.OFFICE) {
      this.diagonal = 10;
    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void printInfo() {
    System.out.println(String.format("Монитор с диагональю %d\"", diagonal));
  }
}
