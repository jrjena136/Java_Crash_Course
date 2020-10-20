package org.javalearning.examples;

import java.util.IdentityHashMap;
import java.util.Map;

public class MapOneKeyMultiValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new IdentityHashMap<>();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2); // hashcode is different
        map.put(i1, "A");
        map.put(i2, "B");
        System.out.println(map.size()); // size is 2
        System.out.println(map.get(i1)); // returns A
        System.out.println("***************************");
        map = new IdentityHashMap<>();
        i1 = 1;
        i2 = 1;
        System.out.println(i1 == i2); // hashcode is different
        map.put(i1, "ABC");
        map.put(i2, "XYZ");
        System.out.println(map.size()); // size is 1
        System.out.println(map.get(i1)); // returns the later added object
        System.out.println("***************************");
        map = new IdentityHashMap<>();
        i1 = Integer.valueOf(1);
        i2 = Integer.valueOf(1);
        System.out.println(i1 == i2); // hashcode is different
        map.put(i1, "Ram");
        map.put(i2, "Shyam");
        System.out.println(map.size()); // size is 1
        System.out.println(map.get(i1)); // returns the later added object
    }
}
