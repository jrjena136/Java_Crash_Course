package org.javalearning.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] data = new int[]{4, 3, 5, 2, 2, 4, 6, 4, 3, 7};
        System.out.println("Array with duplicates");
        System.out.println("******************************");
        System.out.println(Arrays.toString(data));
        System.out.println();
        int[] result = removeDuplicates(data);
        System.out.println("Array without duplicates");
        System.out.println("******************************");
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] data){
        // add the ints into a set
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }

        // copy the elements from the set into an array
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer u : set) {
            result[i++] = u;
        }
        return result;
    }
}
