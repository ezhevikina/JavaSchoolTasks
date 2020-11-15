package com.ezhevikina.basics.homework5.task2.videocard;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class VideoCard implements Component {
  private String manufacturer;
  private String type;
  private int memory;
  private String coolingType;

  public VideoCard(ComputerType computerType) {

    if (computerType == ComputerType.GAMER) {
      this.manufacturer = "Производитель игровых видеокарт";
      this.type = "игровая";
      this.coolingType = "активное";
      this.memory = 100;

    } else if (computerType == ComputerType.OFFICE) {
      this.manufacturer = "Производитель обычных видеокарт";
      this.type = "обычная";
      this.coolingType = "пассивное";
      this.memory = 10;

    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void printInfo() {
    System.out.println(String.format(
        "Видеокарта. Производитель: %s, тип памяти: %s, объем памяти: %d, охлаждение: %s",
        manufacturer,
        type,
        memory,
        coolingType));
  }
}
