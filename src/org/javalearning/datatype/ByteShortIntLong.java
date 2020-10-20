package org.javalearning.datatype;

public class ByteShortIntLong {

    public static void main(String[] args) {
        int myValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myIntMinValue);
        System.out.println("Integer Maximum Value = " + myIntMaxValue);
        System.out.println("Integer Busted Max Value = " + (myIntMaxValue + 1)); // Overflow
        System.out.println("Integer Busted Min Value = " + (myIntMinValue - 1)); // UnderFlow

        int myIntMaxTest = 2_147_483_647;

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);
        System.out.println("Byte Busted Max Value = " + (byte)(myByteMaxValue + 1));

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);
        //long bigLongLiteralValue = 2_147_483_647_234; // CE : Integer number too big. as java compiler treats every whole number as an Integer by default
        long bigLongLiteralValue = 2_147_483_647_234L; // append 'L' to fix CE as this number is within the long range.

        //short bigShortLiteralValue = 32768; // CE : as this is beyond the short range.
        short bigShortLiteralValue = 32767;

        int myTotal = (myIntMinValue / 2);

        byte myTotalByte = (byte) (myByteMinValue / 2);

        short myNewShortValue = (short) (myShortMinValue / 2);
    }
}
