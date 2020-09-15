package com.ezhevikina.basics.homework5.task2.processor;

public class GamerProcessorFactory extends ProcessorFactory {

  @Override
  public GamerProcessor addProcessor() {
    return new GamerProcessor();
  }
}
