package com.ezhevikina.basics.homework5.task2.ram;

import com.ezhevikina.basics.homework5.task2.ComputerType;

public class RamFactory {

  public Ram addRam(ComputerType computerType) {
    if (computerType == ComputerType.GAMER) {
      return new GamerRam();
    } else if (computerType == ComputerType.OFFICE) {
      return new RegularRam();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
