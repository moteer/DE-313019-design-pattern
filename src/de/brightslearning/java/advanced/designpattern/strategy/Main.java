package de.brightslearning.java.advanced.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Bird: " + bird.tryToFly());

        dog.setFlyingAbility(new CanFlyProbably());
        System.out.println("Dog: " + dog.tryToFly());

    }
}
