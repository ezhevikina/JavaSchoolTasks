package com.ezhevikina.basics.homework5.task2;

import com.ezhevikina.basics.homework5.task2.datastorage.DataStorage;
import com.ezhevikina.basics.homework5.task2.monitor.Monitor;
import com.ezhevikina.basics.homework5.task2.processor.Processor;
import com.ezhevikina.basics.homework5.task2.ram.Ram;
import com.ezhevikina.basics.homework5.task2.videocard.VideoCard;

public class Computer {
  private Processor processor;
  private Ram ram;
  private VideoCard videoCard;
  private DataStorage dataStorage;
  private Monitor monitor;

  public Computer(Processor processor, Ram ram, VideoCard videoCard, DataStorage dataStorage, Monitor monitor) {
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
