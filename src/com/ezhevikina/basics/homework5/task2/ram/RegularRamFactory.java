package com.ezhevikina.basics.homework5.task2.ram;

public class RegularRamFactory extends RamFactory {

  @Override
  public Ram addRam() {
    return new RegularRam();
  }
}
