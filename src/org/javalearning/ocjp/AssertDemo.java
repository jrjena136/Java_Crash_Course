package org.javalearning.ocjp;

import java.io.Console;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class AssertDemo {
    public static void main(String[] args) {
        Integer x = 10;
        x++;
        assert x == null && x >= 0;
        System.out.println(x);
        //magic(Stream.empty()); // throw RE
        magic(Stream.iterate(1, y -> y+=y++));
        // magic(Stream.of(5, 10)); // throw RE

        Locale fr = new Locale(Locale.getDefault().getLanguage());
        ResourceBundle r = ResourceBundle.getBundle("Dolphins", fr);
        System.out.println(r.getString("name"));
        System.out.println(r.getString("age"));
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.println(line);
    }

    private static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5)
                .peek(System.out::println)
                .limit(3)
                .max((x,y) -> x - y);
        System.out.println(o.get());
    }
}
