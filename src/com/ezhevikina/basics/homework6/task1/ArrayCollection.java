package com.ezhevikina.basics.homework6.task1;

import java.util.ArrayList;

public class ArrayCollection<E> {

  private final ArrayList<E> arrayCollection;

  public ArrayCollection() {
    arrayCollection = new ArrayList<>();
  }

  public int size() {
    return arrayCollection.size();
  }

  public void add(E element) {
    arrayCollection.add(element);
  }

  public void remove(int index) {
    arrayCollection.remove(index);
  }

  public void remove(E element) {
    arrayCollection.remove(element);
  }

  public E get(int index) {
    return arrayCollection.get(index);
  }

  public void clear() {
    arrayCollection.clear();
  }
}
