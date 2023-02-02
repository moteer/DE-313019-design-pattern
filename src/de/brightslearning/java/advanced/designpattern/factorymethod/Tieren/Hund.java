package de.brightslearning.java.advanced.designpattern.factorymethod.Tieren;

public class Hund implements Tier {


    @Override
    public int preis() {

        return 10;
    }

    @Override
    public void geraeusch() {
        System.out.println ("wuf Wuf Wuf");
    }
}
