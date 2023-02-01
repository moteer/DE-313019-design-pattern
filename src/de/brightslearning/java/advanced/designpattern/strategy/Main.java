package de.brightslearning.java.advanced.designpattern.strategy;

public class Main {
    public static void main(String[] args) {

        //instanziieren von zwei verschiedenen Tierarten
        Animal dog = new Dog();
        Animal bird = new Bird();

        //Ausgabe Hund und Vogel
        System.out.println("Bird: " + bird.tryToFly());
        System.out.println("Dog: " + dog.tryToFly());

        //Ändern der Fähigkeiten des Hundes zu can probably fly
        dog.setFlyingAbility(new CanFlyProbably());

        //Ausgabe nach Änderung
        System.out.println("\nDog: " + dog.tryToFly());

        //Ändern der Fähigkeiten des Hundes zu Superhund
        dog.setFlyingAbility(new ItFlys());
        System.out.println("\nDog: " + dog.tryToFly());


    }
}
