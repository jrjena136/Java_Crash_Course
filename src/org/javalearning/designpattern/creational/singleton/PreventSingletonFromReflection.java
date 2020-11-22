package org.javalearning.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

public class PreventSingletonFromReflection {
    public static void main(String[] args) {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = null;
        try {
            Constructor[] ct = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor c : ct) {
                c.setAccessible(true);
                instance2 = (BillPughSingleton) c.newInstance();
                break;
            }
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
            System.out.println(instance1 == instance2); // breaks singleton
            EnumSingleton s1 = EnumSingleton.INSTANCE;
            System.out.println(s1.hashCode());
            EnumSingleton s2 = EnumSingleton.INSTANCE;
            System.out.println(s1.hashCode());
            System.out.println(s1 == s2);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
