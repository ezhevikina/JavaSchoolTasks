package com.ezhevikina.basics.homework3.task3;

public class Aspirant extends Student {

  private String researchName;

  public Aspirant(String firstName, String lastName, String group, double averageMark, String researchName) {

    super(firstName, lastName, group, averageMark);
    this.researchName = researchName;
  }

  @Override
  public int getScholarship() {

    if (super.getAverageMark() == 5) {
      return 200;
    } else {
      return 180;
    }
  }
}
