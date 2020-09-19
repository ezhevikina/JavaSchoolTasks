package com.ezhevikina.basics.homework6.task1;

import java.util.LinkedList;

public class LinkedListCollection<E> {

  private final LinkedList<E> linkedListCollection;

  public LinkedListCollection() {
    linkedListCollection = new LinkedList<>();
  }

  public int size() {
    return linkedListCollection.size();
  }

  public void add(E element) {
    linkedListCollection.add(element);
  }

  public void remove(int index) {
    linkedListCollection.remove(index);
  }

  public void remove(E element) {
    linkedListCollection.remove(element);
  }

  public E get(int index) {
    return linkedListCollection.get(index);
  }

  public void clear() {
    linkedListCollection.clear();
  }
}
