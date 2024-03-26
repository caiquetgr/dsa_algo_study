package br.com.caiqueborges.arrays;

public class ArrayMain {
  public static void main(String[] args) {
    MyArray<String> array = new MyArray<String>(10);
    array.push("hi");
    array.push("how");
    array.push("are");
    array.push("you");
    array.push("?");
    array.push("!");
    System.out.println(array.toString());
    System.out.println("popped: " + array.pop());
    System.out.println(array.toString());
    System.out.println("deleted: " + array.delete(2));
    System.out.println(array.toString());
    array.push(9, "end");
    System.out.println(array.toString());
    System.out.println("deleted: " + array.delete(1));
    System.out.println(array.toString());
  }
}