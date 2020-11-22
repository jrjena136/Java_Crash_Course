package org.javalearning.designpattern.creational.singleton;

public class SingletonDesignPatternDoubleCheck {
    private static SingletonDesignPatternDoubleCheck INSTANCE;
    private SingletonDesignPatternDoubleCheck() {}
    public static SingletonDesignPatternDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDesignPatternDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDesignPatternDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
