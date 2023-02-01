package de.brightslearning.java.advanced.designpattern.strategy;

public interface Flys {

    String fly();

}

class ItFlys implements Flys{
    public String fly(){
        return "Flying high";
    }
}

class CantFly implements Flys{
    public String fly(){
        return "I cant fly";
    }
}

class CanFlyProbably implements Flys{
    public String fly(){
        return "Im not sure if i can fly";
    }
}