package com.ezhevikina.basics.homework5.task2;

public class Context {

  private BuildComputer computer;

  public void setStrategy(BuildComputer computer) {
    this.computer = computer;
  }

  public Computer build() {
    return computer.build();
  }
}
