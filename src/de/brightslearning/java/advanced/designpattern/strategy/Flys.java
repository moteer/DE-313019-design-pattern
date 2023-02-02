package de.brightslearning.java.advanced.designpattern.strategy;

public interface Flys {

    //Methode fly für alle Tiere zur Verfügung
    String fly();

}


//SUBKLASSEN FÜR DIE JEWEILIGEN METHODEN
class ItFlys implements Flys {
    public String fly() {
        return "Flying high";
    }
}

class CantFly implements Flys {
    public String fly() {
        return "I cant fly";
    }
}

class CanFlyProbably implements Flys {
    public String fly() {
        return "Im not sure if i can fly";
    }
}