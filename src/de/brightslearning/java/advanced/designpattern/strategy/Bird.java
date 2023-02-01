package de.brightslearning.java.advanced.designpattern.strategy;

public class Bird extends Animal{
    public Bird(){
        super();
        flyingType = new ItFlys();
    }
}
