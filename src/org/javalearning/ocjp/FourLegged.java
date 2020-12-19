package org.javalearning.ocjp;

public class FourLegged {
    String walk = "walk,";
    static class BabyRihno extends FourLegged {
        String walk = "toddle,";
    }

    public static void main(String[] args) {
        FourLegged f = new BabyRihno();
        BabyRihno b = new BabyRihno();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }
}
