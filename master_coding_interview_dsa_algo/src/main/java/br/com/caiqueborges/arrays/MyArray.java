package br.com.caiqueborges.arrays;

public class MyArray<T> {
  private int length;
  private final int capacity;
  private final T[] items;

  @SuppressWarnings("unchecked")
  public MyArray(int capacity) {
    this.length = 0;
    this.capacity = capacity;
    this.items = (T[]) new Object[capacity];
  }

  public T get(int index) {
    if (index >= 0 && index < this.length) {
      return this.items[index];
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  public int push(T item) {
    if (length >= capacity)
      throw new RuntimeException("array is full");
    items[length++] = item;
    return length;
  }

  public int push(int index, T item) {
    if (length >= capacity)
      throw new RuntimeException("array is full");
    if (items[index] == null) {
      length++;
    }
    items[index] = item;
    return length;
  }

  public T pop() {
    T t = items[--length];
    items[length] = null;
    return t;
  }

  public T delete(int index) {
    T deletedItem = items[index];
    shiftItems(index);
    return deletedItem;
  }

  private void shiftItems(int index) {
    for (int i = index; i < capacity - 1; i++) {
      items[i] = items[i + 1];
    }
    length--;
    items[capacity - 1] = null;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("length=" + length);
    s.append(", capacity=" + capacity);
    s.append(", items=");
    for (T t : items) {
      s.append("{" + t + "},");
    }
    return s.toString();
  }
}