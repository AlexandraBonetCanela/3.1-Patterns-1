package org.example;

public abstract class Telephone {
    protected String number;
    protected String prefix;

    public Telephone(String number) {
        this.number = number;
    }

    public abstract void getTelephone();
}
