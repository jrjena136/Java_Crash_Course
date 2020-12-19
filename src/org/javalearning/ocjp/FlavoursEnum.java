package org.javalearning.ocjp;

public class FlavoursEnum {
    enum Flavours {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        System.out.println(Flavours.CHOCOLATE.ordinal());
    }
}