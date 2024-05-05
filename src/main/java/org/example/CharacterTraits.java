package org.example;

public class CharacterTraits {
    private String property;

    private int value;

    public CharacterTraits(String property, int value) {
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return property + ": " + +value;
    }
}
