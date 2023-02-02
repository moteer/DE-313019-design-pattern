package de.brightslearnning.java.advanced.designpattern.builder;

class TipiHouseBuilder implements HouseBuilder //Concrete Builder
{
    private HouseThingToBuild house;

    public TipiHouseBuilder()
    {
        this.house = new HouseThingToBuild();
    }

    public void buildBasement()
    {
        house.setBasement("Wooden Poles");
    }

    public void buildStructure()
    {
        house.setStructure("Wood and Ice");
    }

    public void buildInterior()
    {
        house.setInterior("Fire Wood");
    }

    public void buildRoof()
    {
        house.setRoof("Wood, caribou and seal skins");
    }

    public HouseThingToBuild getHouse()
    {
        return this.house;
    }

}