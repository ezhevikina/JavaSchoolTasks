package com.ezhevikina.basics.homework5.task2.videocard;

public class GamerVideoCardFactory extends VideoCardFactory {

  @Override
  public VideoCard addVideoCard() {
    return new GamerVideoCard();
  }
}
