package com.ezhevikina.basics.homework5.task2.ram;

public class GamerRamFactory extends RamFactory {

  @Override
  public Ram addRam() {
    return new GamerRam();
  }
}
