package org.javalearning.designpattern.creational.singleton;

import java.io.*;

class SingletonA implements Serializable {
    private static final SingletonA INSTANCE = new SingletonA();
    private SingletonA() {

    }
    public static SingletonA getInstance() {
        return INSTANCE;
    }
    public Object readResolve() {
        return INSTANCE;
    }
}

public class PreventSingletonFromSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonA instance1 = SingletonA.getInstance();
        ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instance1);
        out.close();

        // deserailize from file to object
        ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));

        SingletonA instance2 = (SingletonA) in.readObject();
        in.close();

        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
