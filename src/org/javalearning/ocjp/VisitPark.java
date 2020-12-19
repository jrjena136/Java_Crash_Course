package org.javalearning.ocjp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VisitPark {
    public enum AnimalsInPark {
        SQUIRREL, CHIPMUNK, SPARROW;
    }

    public static void main(String[] args) throws IOException {
        AnimalsInPark[] animals = AnimalsInPark.values();
        System.out.println(animals[1]);

        String d = Duration.ofDays(2).toString();
        System.out.println(d);
        String p = Period.ofDays(2).toString();
        System.out.println(p);

        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        System.out.println(b1 + " " + b2);

        Path path = Paths.get("/gorilla/signed-words.txt");

        /*Files.find(path.getParent(),10.0,  // k1
                (Path x) -> x.toString().endsWith(".txt") && Files.isDirectory(x)) // k2
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Files.readAllLines(path).stream() // k3
                .flatMap(a -> Stream.of(a.split(" "))) // k4
                .map(s -> s.toLowerCase()) // k5
                .forEach(System.out::println);*/
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println).collect(Collectors.toList());
    }
}
