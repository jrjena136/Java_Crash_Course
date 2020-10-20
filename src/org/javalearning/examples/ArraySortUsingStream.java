package org.javalearning.examples;

import java.util.*;

public class ArraySortUsingStream {
    public static void main(String[] args) {

        Integer [] integers = {-2, 5, 8, 7, 3, 9, 0, 11, -4, 4};
        // Using Arrays.sort()
        System.out.println("Before Using Arrays.sort() : " + Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("After Using Arrays.sort() : " + Arrays.toString(integers));

        // using java8 stream
        integers = new Integer[] { -2, 5, 8, 7, 3, 9, 0, 11, -4, 4 };
        System.out.println("Before Using java8 stream : " + Arrays.toString(integers));
        Arrays.asList(integers).stream().sorted().forEach(System.out::println);

        integers = new Integer[] { -2, 5, 8, 7, 3, 9, 0, 11, -4, 4 };
        List<Integer> list = Arrays.asList(integers);
        List<Integer> result = new ArrayList<>();
        list.stream().sorted(Comparator.naturalOrder()).forEach(x -> result.add(x));
        System.out.println("result : " + result);

        // using Collections.sort()
        integers = new Integer[] { -2, 5, 8, 7, 3, 9, 0, 11, -4, 4 };
        List <Integer> unsorted = Arrays.asList(integers);
        System.out.println("Before Using Collections.sort() : " + unsorted);
        Collections.sort(unsorted);
        System.out.println("After Using Collections.sort() : " + unsorted);

        // using traditional sorting approach
        System.out.println("With traditional approach, before sort : " + unsorted);
        integers = new Integer[] { -2, 5, 8, 7, 3, 9, 0, 11, -4, 4 };
        for (int i = 0; i < integers.length - 1; i++) {
            for(int j = 0; j < integers.length-i-1; j++)
            if (integers[j] > integers[j+1]) {
                int temp = integers[j];
                integers[j] = integers[j+1];
                integers[j+1] = temp;
            }
        }
        System.out.println("After Sorted array : " + Arrays.toString(integers));

        // recursive bubble sort
        integers = new Integer[] { -2, 5, 8, 7, 3, 9, 0, 11, -4, 4 };
        System.out.println("before recursive bubble Sort : " + Arrays.toString(integers));
        bubbleSort(integers, integers.length);
        System.out.println("After recursive bubble Sort : " + Arrays.toString(integers));
    }

    static void bubbleSort(Integer arr[], int n)
    {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i+1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("Array after each iteration :" + Arrays.toString(arr));

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }
}
