package org.javalearning.ocjp;

import java.util.ArrayList;

public class IsItFurry {
    interface Mamal {}
    static class Furry implements Mamal{}
    static class Chipmunk extends Furry{}

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        Mamal m = c;
        Furry f = c;
        int result = 0;
        if (c instanceof Mamal) result += 1;
        if (c instanceof Furry) result += 2;
        if (null instanceof Chipmunk) result += 4;
        System.out.println(result);

        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int res = 0;
        if (c instanceof Chipmunk) res += 1;
        //if (l instanceof Chipmunk) res += 2;
        if (r instanceof Chipmunk) res += 4;
        System.out.println(res);

    }
}
