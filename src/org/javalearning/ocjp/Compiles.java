package org.javalearning.ocjp;

import java.util.Scanner;

public class Compiles {
    static class RainException extends Exception {}

    public static void main(String[] args) throws RainException {
        try(Scanner sc = new Scanner("rain")){
            if (sc.nextLine().equals("rain")) {
                throw new RainException();
            }
            //System.out.println(sc.nextLine());
        } catch (RainException re) {
            System.out.println(re.getCause());
        }
    }
}
