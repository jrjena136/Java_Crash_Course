package org.javalearning.designpattern.creational.singleton;

public class SingletonDesignPatternLazy {
    private static SingletonDesignPatternLazy INSTANCE;
    private SingletonDesignPatternLazy() {

    }
    public static SingletonDesignPatternLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDesignPatternLazy();
        }
        return INSTANCE;
    }
}
