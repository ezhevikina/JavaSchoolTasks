package com.ezhevikina.basics.homework5.task2;

public class Computer {
  private Component processor;
  private Component ram;
  private Component videoCard;
  private Component dataStorage;
  private Component monitor;

  public Computer(Component processor, Component ram, Component videoCard, Component dataStorage, Component monitor) {
    this.processor = processor;
    this.ram = ram;
    this.videoCard = videoCard;
    this.dataStorage = dataStorage;
    this.monitor = monitor;
  }

  public void printInfo() {
    System.out.println("Внутри:");
    this.processor.printInfo();
    this.ram.printInfo();
    this.videoCard.printInfo();
    this.dataStorage.printInfo();
    this.monitor.printInfo();
  }
}
