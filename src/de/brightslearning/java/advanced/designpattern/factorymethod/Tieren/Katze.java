package de.brightslearning.java.advanced.designpattern.factorymethod.Tieren;

public class Katze implements Tier {
    @Override
    public int preis() {
        return 5;
    }

    @Override
    public void geraeusch() {
        System.out.println ("Miau");
    }
}
