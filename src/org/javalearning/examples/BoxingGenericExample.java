package org.javalearning.examples;

public class BoxingGenericExample {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        genericBoxTest(box);
        Box1<Integer> box1 = new Box1<>();
        //genericBoxTest1(box1);
        // CE - though Number class is the parent of Integer, Box1 has generic type Integer and it will not be allowed
        // to make this code work Box1 class should extend from java.lang.Number like BoxN class and it should be of type Number
    }

    public static void genericBoxTest(BoxN<Number> box) {
        // some code
    }

    public static void genericBoxTest1(BoxN<Number> box) {
        // some code
    }

    public static class Box1<Integer> extends Number {

        @Override public int intValue() {
            return 0;
        }

        @Override public long longValue() {
            return 0;
        }

        @Override public float floatValue() {
            return 0;
        }

        @Override public double doubleValue() {
            return 0;
        }
    }

    public static class Box<Integer> extends BoxN{
        // some code
    }

    public static class BoxN<Number> extends java.lang.Number {

        @Override public int intValue() {
            return 0;
        }

        @Override public long longValue() {
            return 0;
        }

        @Override public float floatValue() {
            return 0;
        }

        @Override public double doubleValue() {
            return 0;
        }
    }
}
