package org.javalearning.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsUsingRegex {
    public static void main(String[] args) {

        //String regex = "\\b(\\w+)\\s+\\1\\b";
        String regex = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("******" + p.toString());

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        System.out.println("******" + numSentences);

        while (numSentences-- > 0) {
            String input = in.nextLine();
            System.out.println("******" + input);

            Matcher m = p.matcher(input);
            System.out.println("*********"+ m.toString());

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                System.out.println("#########" + m.group(0));
                System.out.println("#########" + m.group(1));
                input = input.replaceAll(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
