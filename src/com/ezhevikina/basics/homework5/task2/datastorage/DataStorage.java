package com.ezhevikina.basics.homework5.task2.datastorage;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class DataStorage implements Component {
  private String manufacturer;
  private String type;
  private int formFactor;

  public DataStorage(ComputerType computerType) {

    if (computerType == ComputerType.GAMER) {
      this.manufacturer = "Производитель классных накопителей";
      this.type = "SSD";
      this.formFactor = 100;

    } else if (computerType == ComputerType.OFFICE) {
      this.manufacturer = "Производитель обычных накопителей";
      this.type = "HDD";
      this.formFactor = 10;

    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void printInfo() {
    System.out.println(String.format(
        "Накопитель. Производитель: %s, тип: %s, форм-фактор: %d",
        manufacturer,
        type,
        formFactor));
  }
}
