package com.ezhevikina.basics.homework5.task2;

import com.ezhevikina.basics.homework5.task2.datastorage.GamerDataStorageFactory;
import com.ezhevikina.basics.homework5.task2.monitor.GamerMonitorFactory;
import com.ezhevikina.basics.homework5.task2.processor.GamerProcessorFactory;
import com.ezhevikina.basics.homework5.task2.ram.GamerRamFactory;
import com.ezhevikina.basics.homework5.task2.videocard.GamerVideoCardFactory;

public class BuildGamerComputer implements BuildComputer {

  @Override
  public Computer build() {
    System.out.println("Собран игровой компьютер.");
    return new Computer(
        new GamerProcessorFactory().addProcessor(),
        new GamerRamFactory().addRam(),
        new GamerVideoCardFactory().addVideoCard(),
        new GamerDataStorageFactory().addDataStorage(),
        new GamerMonitorFactory().addMonitor());
  }
}
