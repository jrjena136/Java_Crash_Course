package org.javalearning.examples;

public class CalculateNumberOfTurns {
    public static void main(String[] args) {
        String input = "abcabc";
        int m = 1;
        int n = 2;
        int result = calculateTurns(input, m, n);
        System.out.println(result);
        System.out.println(Boolean.parseBoolean(null));
    }

    public static int calculateTurns(String input, int m, int n) {
        int totalTurns = 0;
        if (m > input.length() || n > input.length()) {
            throw new UnsupportedOperationException("Operation not supported");
        }
        String stringToCalculate = input;
        String result = null;
        do {
            int length = stringToCalculate.length();
            result = stringToCalculate.substring(length - m).concat(stringToCalculate.substring(0, (length - m)));
            totalTurns++;
            if (input.equals(result)) {
                break;
            }
            result = result.substring(length - n).concat(result.substring(0, (length - n)));
            totalTurns++;
            stringToCalculate = result;
        } while (!input.equals(result));
        return totalTurns;
    }
}
