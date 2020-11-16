package com.ezhevikina.basics.homework6.task1;

public class ArrayCollection<E> {
  private E[] values;

  public ArrayCollection() {
    this.values = (E[]) new Object[0];
  }

  public void add(E element) {
    E[] tmp = values;
    values = (E[]) new Object[tmp.length + 1];
    System.arraycopy(tmp, 0, values, 0, tmp.length);
    values[values.length - 1] = element;
  }

  public void remove(int index) {
    E[] tmp = values;
    values = (E[]) new Object[tmp.length - 1];
    System.arraycopy(tmp, 0, values, 0, index);
    int elementsAfterIndex = tmp.length - index - 1;
    System.arraycopy(tmp, index + 1, values, index, elementsAfterIndex);
  }

  public E get(int index) {
    return values[index];
  }

  public int size() {
    return values.length;
  }

  public void remove(E element) {
    for (int i = 0; i < values.length; i++) {
      if (values[i] == element) {
        this.remove(i);
        break;
      }
    }
  }

  public void clear() {
    values = (E[]) new Object[]{};
  }
}
