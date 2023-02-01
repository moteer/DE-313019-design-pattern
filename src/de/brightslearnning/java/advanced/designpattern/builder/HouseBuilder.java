package de.brightslearnning.java.advanced.designpattern.builder;

interface HouseBuilder //interface
{
    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    HouseThingToBuild getHouse();
}
