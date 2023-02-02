package de.brightslearning.java.advanced.designpattern.observerPattern;

public class Forscher implements Beobachter {

    private String name;
    private Pinguin pinguin;


    public Forscher(Pinguin pinguin, String name) {
        this.pinguin = pinguin;
        this.name = name;
        pinguin.registriereBeobachter(this);
    }


    @Override
    public void aktualisiere() {
        System.out.println("Der Forscher " + name + " sieht," + " dass der Pinguin " + name + " gerade " + pinguin.getAktion());
    }
}
