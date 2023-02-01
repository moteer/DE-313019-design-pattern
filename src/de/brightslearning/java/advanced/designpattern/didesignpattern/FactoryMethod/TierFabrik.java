package de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod;


import de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod.Tieren.Fisch;
import de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod.Tieren.Hund;
import de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod.Tieren.Katze;
import de.brightslearning.java.advanced.designpattern.didesignpattern.FactoryMethod.Tieren.Tier;

public  class TierFabrik {
    public static Tier tierBestellen(String tier){
        if (tier.equals ("Hund")){
            return new Hund ();
        } else if (tier.equals ("Katze")) {
            return new Katze ();
        } else if (tier.equals ("Fisch")) {
            return new Fisch ();
        }
        return null;
    }
}
