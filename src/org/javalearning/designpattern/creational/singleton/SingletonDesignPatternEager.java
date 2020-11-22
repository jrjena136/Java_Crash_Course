package org.javalearning.designpattern.creational.singleton;

/**
 * This is a singleton design pattern implementation with eager initialization
 *  Here, whether we want it or not, the instance of the class will be created.
 *  1. create a private static variable which holds the class instance.
 *  2. make the constructor private the restrict object creation from other class.
 *  3. create a public static method which will return the instace.
 */
public class SingletonDesignPatternEager {
    private static final SingletonDesignPatternEager INSTANCE = new SingletonDesignPatternEager();
    private SingletonDesignPatternEager() {

    }
    public static SingletonDesignPatternEager getInstance() {
        return INSTANCE;
    }
}
