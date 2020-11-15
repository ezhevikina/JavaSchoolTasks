package com.ezhevikina.basics.homework5.task2.videocard;

import com.ezhevikina.basics.homework5.task2.Component;
import com.ezhevikina.basics.homework5.task2.ComponentFactory;
import com.ezhevikina.basics.homework5.task2.ComputerType;

public class VideoCardFactory extends ComponentFactory {
  @Override
  public Component addComponent(ComputerType computerType) {
    return new VideoCard(computerType);
  }
}
