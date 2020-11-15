package com.ezhevikina.basics.homework5.task2.ram;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class Ram implements Component {

  private String manufacturer;
  private int memory;
  private int frequency;
  private String type;

  public Ram(ComputerType computerType) {

    if (computerType == ComputerType.GAMER) {
      this.manufacturer = "производитель игровых ОЗУ";
      this.frequency = 100;
      this.memory = 100;
      this.type = "DDR3";

    } else if (computerType == ComputerType.OFFICE) {
      this.manufacturer = "производитель обычных ОЗУ";
      this.frequency = 10;
      this.memory = 10;
      this.type = "DDR2";

    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void printInfo() {
    System.out.println(String.format(
        "ОЗУ. Производитель: %s, объем памяти: %d, частота: %d, тип: %s",
        manufacturer,
        memory,
        frequency,
        type));
  }
}
