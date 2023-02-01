package de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod;

import de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod.Tieren.Tier;

public class Haustierladen extends TierFabrik {
    public static void main (String[] args) {
        Tier hund = TierFabrik.tierBestellen ("Hund");
        hund.geraeusch ();
        System.out.println (hund.preis ());

    }
}
