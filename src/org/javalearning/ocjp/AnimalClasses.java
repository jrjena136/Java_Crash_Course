package org.javalearning.ocjp;

public enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
    REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
    boolean hasHair;
    private AnimalClasses(boolean hasHair) {
        this.hasHair = hasHair;
    }
    public boolean hasHair() {
        return hasHair;
    }
    public void giveWig() {
        hasHair = true;
    }
}
