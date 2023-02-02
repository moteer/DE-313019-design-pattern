package de.brightslearning.java.advanced.designpattern.factorymethod.Tieren;

public class Fisch implements Tier {
    @Override
    public int preis() {
        return 2;
    }

    @Override
    public void geraeusch() {
        System.out.println("Blubb");
    }
}
