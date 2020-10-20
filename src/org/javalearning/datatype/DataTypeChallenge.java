package org.javalearning.datatype;

public class DataTypeChallenge {

    public static void main(String[] args) {
        byte byteValue = 110;
        short shortValue = 550;
        int intValue = 1100;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);
        short newShortValue = (short) (50000L + 10L * (byteValue + shortValue + intValue));
        System.out.println(newShortValue);
        short newShortValue1 = (short) (1000L + 10L * (byteValue + shortValue + intValue));
        System.out.println(newShortValue1);
    }
}
