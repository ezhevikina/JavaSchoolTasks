package com.ezhevikina.basics.homework5.task2;

import com.ezhevikina.basics.homework5.task2.datastorage.DataStorageFactory;
import com.ezhevikina.basics.homework5.task2.monitor.MonitorFactory;
import com.ezhevikina.basics.homework5.task2.processor.ProcessorFactory;
import com.ezhevikina.basics.homework5.task2.ram.RamFactory;
import com.ezhevikina.basics.homework5.task2.videocard.VideoCardFactory;

public class BuildGamerComputer implements BuildComputer {

  @Override
  public Computer build() {
    System.out.println("Собран игровой компьютер.");
    return new Computer(
        new ProcessorFactory().addComponent(ComputerType.GAMER),
        new RamFactory().addComponent(ComputerType.GAMER),
        new VideoCardFactory().addComponent(ComputerType.GAMER),
        new DataStorageFactory().addComponent(ComputerType.GAMER),
        new MonitorFactory().addComponent(ComputerType.GAMER));
  }
}
