package org.javalearning.ocjp;

public interface Otter {
    default void play() {}
}
class RiveOtter implements Otter {
    @Override public boolean equals(Object o) { return false; }
    //@Override public boolean equals(Otter o) { return false; }
    @Override public int hashCode() { return 42; }
    //@Override public long hashCode() { return 42; }
    @Override public void play() { }
    //@Override void play() { }
}
