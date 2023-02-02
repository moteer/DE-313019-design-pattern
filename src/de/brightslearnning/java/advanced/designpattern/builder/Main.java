package de.brightslearnning.java.advanced.designpattern.builder;

public class Main
{
    public static void main(String[] args)
    {   //Build an Igloo --> therefore we need an engineer, who knows how to build houses and  in this case
        //knows how to build igloos --> therefore he gets the IglooHouseBuilder
        CivilEngineerDirector engineer = new CivilEngineerDirector(new IglooHouseBuilder());

        engineer.constructHouse();

        HouseThingToBuild house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}