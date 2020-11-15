package com.ezhevikina.basics.homework5.task2;

import com.ezhevikina.basics.homework5.task2.datastorage.DataStorageFactory;
import com.ezhevikina.basics.homework5.task2.monitor.MonitorFactory;
import com.ezhevikina.basics.homework5.task2.processor.ProcessorFactory;
import com.ezhevikina.basics.homework5.task2.ram.RamFactory;
import com.ezhevikina.basics.homework5.task2.videocard.VideoCardFactory;

public class BuildOfficeComputer implements BuildComputer {

  @Override
  public Computer build() {
    System.out.println("Собран офисный компьютер.");
    return new Computer(
        new ProcessorFactory().addComponent(ComputerType.OFFICE),
        new RamFactory().addComponent(ComputerType.OFFICE),
        new VideoCardFactory().addComponent(ComputerType.OFFICE),
        new DataStorageFactory().addComponent(ComputerType.OFFICE),
        new MonitorFactory().addComponent(ComputerType.OFFICE));

  }
}
