package de.brightslearning.java.advanced.designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Pinguin implements Subjekt {

    private List<Beobachter> beobachterListe = new ArrayList<>();

    private String aktion;

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachterListe.add(beobachter);
    }

    @Override
    public void entferneBeobachter(Beobachter beobachter) {
        this.beobachterListe.remove(beobachter);
    }

    @Override
    public void benachrichtigeBeobachter() {
        for(Beobachter beobachter : beobachterListe){
            beobachter.aktualisiere();
        }
    }

    public String getAktion(){
        return aktion;
    }

    public void setAktion(String aktion){
        this.aktion = aktion;
        this.benachrichtigeBeobachter();
    }

}
