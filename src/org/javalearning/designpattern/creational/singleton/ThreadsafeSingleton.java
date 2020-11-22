package org.javalearning.designpattern.creational.singleton;

import javax.swing.*;

public class ThreadsafeSingleton {
    private static ThreadsafeSingleton INSTANCE;
    private ThreadsafeSingleton() {}
    public static synchronized ThreadsafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadsafeSingleton();
        }
        return INSTANCE;
    }
}
