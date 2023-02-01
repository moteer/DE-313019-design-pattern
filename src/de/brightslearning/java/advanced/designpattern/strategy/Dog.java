package de.brightslearning.java.advanced.designpattern.strategy;

public class Dog extends Animal{

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }
}
