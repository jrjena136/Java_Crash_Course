package org.javalearning.ocjp;

public interface ITest {
    void test();
}

abstract class ATest implements ITest{
    // when abstract class implements interface that method is inherited from interface and is automatically abstract.
    // abstract class can override the method or let the child class override it.
    // or abstract class can explicitly declare the abstract method with same name as interface
    public abstract void test();
    /*@Override public void test() {
        //super.test(); CE - because there is no such method in Object class
        System.out.println("ATest");
    }*/
}
class CTest /* extends ATest */ implements ITest {

    @Override public void test() {
        // CE - when ATest class does not override test() method.
        // no CE - when ATest class overrides test() method
        //super.test();
        System.out.println("CTest");
    }
}
class CTest1 extends ATest /* implements ITest */ {
    @Override public void test() {
        System.out.println("CTest1");
    }
}
class Test {
    public static void main(String[] args) {
        ITest t = new CTest();
        ITest t1 = new CTest1();
        t.test();
        t1.test();
    }
}
