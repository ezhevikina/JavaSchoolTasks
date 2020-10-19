package com.ezhevikina.basics.homework5.task2.videocard;

import com.ezhevikina.basics.homework5.task2.ComputerType;

public class VideoCardFactory {

  public VideoCard addVideoCard(ComputerType computerType) {
    if (computerType == ComputerType.GAMER) {
      return new GamerVideoCard();
    } else if (computerType == ComputerType.OFFICE) {
      return new RegularVideoCard();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
