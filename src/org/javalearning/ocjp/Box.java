package org.javalearning.ocjp;

public class Box<T> {
    T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<String> b1 = new Box<>("a string");
        Box<Integer> b2 = new Box<>(123);
        System.out.print(b1.getValue());
        System.out.print(b2.getValue());
    }
}
