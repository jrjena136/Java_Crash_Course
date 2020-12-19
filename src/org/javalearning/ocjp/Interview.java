package org.javalearning.ocjp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        // Question - 1
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1, "ABC");
        Student s2 = new Student(1, "ABC");
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());

        // Question - 2
        execute(null);

        // Question - 3
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Ball");
        map.put("C", "Cat");
        map.put("D", "Dog");
        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()) {
            String key = itr.next(); // it will throw ConCurrentModificationException from here
            //map.put("E", "Elephant");
            System.out.println(map.get(key));
        }
        System.out.println("------------------");

        // Question - 4
        System.out.println(3.0/0.0);
    }

    public static void execute(TestClass tc) {
        tc.print();
    }

    @Override public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override public int hashCode() {
        return super.hashCode();
    }
}

class TestClass {
    public static void print() {
        System.out.println("Hello");
    }
}

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/*
Other Questions
    what is the logic in the Object class equals method or how it calculates the equality?
    what is encapsulation and why we need this?
    what is the best way obj.property = value or obj.setProperty(value)?
    what is polymorphism ? static and dynamic polymorphism? real time example
    what is method overloading and why we need this? asks real time example in coding where it is used
    how you define a primary key in entity class using hibernate?
    how to create composite primary key in hibernate?
    how to disable lazy loading if I want?
    how to exclude tomcat from spring starter project?
    what are the defaults folders and files created when spring boot starter project is created?
    how to pull a dependency which is not there over internet using pom.xml?
    what is immutable class and how do you create an immutable class?
    what is the use of hashCode and equals method?
    what is HashSet and tell some details?
    what is HashMap and tell some details?
    scenario based question on interface and abstract class and concrete class.
        interface A -> public void test();
        abstract class B -> public abstract void test();
        class C extends B implements A - > what will happen

 */