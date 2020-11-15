package com.ezhevikina.basics.homework5.task2.processor;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class Processor implements Component {
  private int coreSpeed;
  private int cores;
  private int cache;
  private String name;
  private String manufacturer;

  public Processor(ComputerType computerType) {

    if (computerType == ComputerType.GAMER) {
      this.coreSpeed = 100;
      this.cores = 100;
      this.cache = 100;
      this.name = "Игровой процессор";
      this.manufacturer = "Производитель игровых процессоров";

    } else if (computerType == ComputerType.OFFICE) {
      this.coreSpeed = 10;
      this.cores = 10;
      this.cache = 10;
      this.name = "Обычный процессор";
      this.manufacturer = "Производитель обычных процессоров";

    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void printInfo() {
    System.out.println(String.format(
        "%s. Производитель: %s, тактовая частота: %d, ядер: %d, кэш: %d",
        name,
        manufacturer,
        coreSpeed,
        cores,
        cache));
  }

}
