package com.ezhevikina.basics.homework3;

public class Phone {

  private String number;
  private String model;
  private int weight = 100;

  public Phone(String number, String model, int weight) {
    this(number, model);
    this.weight = weight;
  }

  public Phone(String number, String model) {
    this.number = number;
    this.model = model;
  }

  public Phone() {
    this.number = "number";
    this.model = "model";
  }

  public void receiveCall(String callerName) {
    System.out.println(String.format("Звонит %s", callerName));
  }

  public void receiveCall(String callerName, String callerNumber) {
    System.out.println(String.format("Звонит %s %s", callerName, callerNumber));
  }

  public String getNumber() {
    return this.number;
  }

  public String getModel() {
    return model;
  }

  public int getWeight() {
    return weight;
  }

  public void sendMessage(String ... numbers) {
    for (String s : numbers) {
      System.out.println(s);
    }
  }
}
