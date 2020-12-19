package org.javalearning.ocjp;

import java.io.IOException;

public class LearnToWork {
    public void toddle() throws RuntimeException{
        System.out.println("default");
    }
    class BabyRhino extends LearnToWork {
        /*public void toddle() {
            System.out.println("BabyRihno");
        }*/
        public final void toddle() {
            System.out.println("BabyRihno");
        }
        //public static void toddle() {}
        //public void toddle() throws Exception {}
        public void toddle(boolean fall) {}
    }

    public static void main(String[] args) throws Exception {
        LearnToWork x = new LearnToWork().new BabyRhino();
        x.toddle();
    }
}
