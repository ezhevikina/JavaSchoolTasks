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
        new ProcessorFactory().addProcessor(ComputerType.GAMER),
        new RamFactory().addRam(ComputerType.GAMER),
        new VideoCardFactory().addVideoCard(ComputerType.GAMER),
        new DataStorageFactory().addDataStorage(ComputerType.GAMER),
        new MonitorFactory().addMonitor(ComputerType.GAMER));
  }
}
