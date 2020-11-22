package org.javalearning.designpattern.creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        // singleton design pattern - eager initialization
        System.out.println(SingletonDesignPatternEager.getInstance().hashCode());
        System.out.println(SingletonDesignPatternEager.getInstance().hashCode());
        System.out.println(SingletonDesignPatternLazy.getInstance().hashCode());
        System.out.println(SingletonDesignPatternLazy.getInstance().hashCode());
        System.out.println(SingletonDesignPatternDoubleCheck.getInstance().hashCode());
        System.out.println(SingletonDesignPatternDoubleCheck.getInstance().hashCode());
    }
}
