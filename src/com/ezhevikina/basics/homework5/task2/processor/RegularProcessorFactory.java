package com.ezhevikina.basics.homework5.task2.processor;

public class RegularProcessorFactory extends ProcessorFactory {
  @Override
  public Processor addProcessor() {
    return new RegularProcessor();
  }
}
