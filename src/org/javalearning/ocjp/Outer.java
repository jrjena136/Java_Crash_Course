package org.javalearning.ocjp;

public class Outer {
    /*private int x = 24;
    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;
            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }*/

    class Inner{}
    public static void main(String[] args) {
        //Inner in = new Inner();
        //Inner in = Outer.new Inner();
        //Outer.Inner in = new Outer.Inner();
        //Outer.Inner in = new Outer().Inner();
        Outer.Inner in = new Outer().new Inner();
        //Outer.Inner in = Outer.new Inner();
    }
}

// Ans - x is 24