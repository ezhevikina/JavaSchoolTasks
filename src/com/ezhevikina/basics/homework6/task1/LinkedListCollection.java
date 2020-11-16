package com.ezhevikina.basics.homework6.task1;

public class LinkedListCollection<E> {
  private int size = 0;
  private Node<E> firstNode;
  private Node<E> lastNode;

  public LinkedListCollection() {
    lastNode = new Node<>(null, null, null);
    firstNode = new Node<>(null, null, lastNode);
    lastNode.setPrev(firstNode);
  }

  public void add(E element) {
    Node<E> current = new Node<>(element, lastNode.getPrev(), lastNode);
    Node<E> previous = lastNode.getPrev();
    lastNode.setPrev(current);
    previous.setNext(current);
    size++;
  }

  public void remove(int index) {
    Node<E> node = firstNode.getNext();
    for (int i = 0; i < index; i++) {
      node = getNext(node);
    }
    node.getPrev().setNext(node.getNext());
    node.getNext().setPrev(node.getPrev());
    size--;
  }

  public E get(int index) {
    Node<E> node = firstNode.getNext();
    for (int i = 0; i < index; i++) {
      node = getNext(node);
    }
    return node.getCurrent();
  }

  public int size() {
    return size;
  }

  public void remove(E element) {
    Node<E> node = firstNode;
    while (!node.equals(lastNode)) {
      if (node.getCurrent() == element) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        size--;
        break;
      } else {
        node = getNext(node);
      }
    }
  }

  public void clear() {
    lastNode = new Node<>(null, firstNode, null);
    firstNode = new Node<>(null, null, lastNode);
    size = 0;
  }

  private Node<E> getNext(Node<E> current) {
    return current.getNext();
  }

  private class Node<E> {
    private E current;
    private Node<E> prev;
    private Node<E> next;

    public Node(E current, Node<E> prev, Node<E> next) {
      this.current = current;
      this.prev = prev;
      this.next = next;
    }

    public E getCurrent() {
      return current;
    }

    public void setCurrent(E current) {
      this.current = current;
    }

    public Node<E> getPrev() {
      return prev;
    }

    public void setPrev(Node<E> prev) {
      this.prev = prev;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }
  }
}
