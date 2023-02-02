package de.brightslearning.java.advanced.designpattern.observerPattern;

import java.util.EventListener;

public class Main implements EventListener {
    public static void main(String[] args) {
        Pinguin pingu = new Pinguin();

        Forscher forscherTim = new Forscher(pingu, "Tim");
        Forscher forscherBen = new Forscher(pingu, "Ben");

        //Bsp
        pingu.setAktion("schläft");
        System.out.println();
        pingu.setAktion("isst");
        System.out.println();
        pingu.setAktion("watschelt");
    }
}
