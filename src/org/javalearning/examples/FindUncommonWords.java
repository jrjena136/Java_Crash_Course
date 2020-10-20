package org.javalearning.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUncommonWords {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        findUnCommonWords(A, B);
    }

    private static void findUnCommonWords(String A, String B) {
        List<String> finalList = new ArrayList<>();
        Map<String, Long> aFreq =
                Stream.of(A.trim().split("\\s+"))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Map<String, Long> bFreq =
                Stream.of(B.trim().split("\\s+"))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        for (String s : bFreq.keySet()) {
            if (aFreq.get(s) == null) {
                finalList.add(s);
            }
        }
        for (String s : aFreq.keySet()) {
            if (bFreq.get(s) == null) {
                finalList.add(s);
            }
        }
        System.out.println(finalList);
    }
}
