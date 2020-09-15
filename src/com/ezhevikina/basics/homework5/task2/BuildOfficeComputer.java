package com.ezhevikina.basics.homework5.task2;

import com.ezhevikina.basics.homework5.task2.datastorage.RegularDataStorageFactory;
import com.ezhevikina.basics.homework5.task2.monitor.RegularMonitorFactory;
import com.ezhevikina.basics.homework5.task2.processor.RegularProcessorFactory;
import com.ezhevikina.basics.homework5.task2.ram.RegularRamFactory;
import com.ezhevikina.basics.homework5.task2.videocard.RegularVideoCardFactory;

public class BuildOfficeComputer implements BuildComputer {

  @Override
  public Computer build() {
    System.out.println("Собран офисный компьютер.");
    return new Computer(
        new RegularProcessorFactory().addProcessor(),
        new RegularRamFactory().addRam(),
        new RegularVideoCardFactory().addVideoCard(),
        new RegularDataStorageFactory().addDataStorage(),
        new RegularMonitorFactory().addMonitor());

  }
}
