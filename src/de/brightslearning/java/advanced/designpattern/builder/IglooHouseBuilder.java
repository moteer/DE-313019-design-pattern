package de.brightslearning.java.advanced.designpattern.builder;

class IglooHouseBuilder implements HouseBuilder  //Concrete Builder
{
    private HouseThingToBuild house;

    public IglooHouseBuilder()
    {
        this.house = new HouseThingToBuild();
    }

    public void buildBasement()
    {
        house.setBasement("Ice Bars");
    }

    public void buildStructure()
    {
        house.setStructure("Ice Blocks");
    }

    public void buildInterior()
    {
        house.setInterior("Ice Carvings");
    }

    public void buildRoof()
    {
        house.setRoof("Ice Dome");
    }

    public HouseThingToBuild getHouse()
    {
        return this.house;
    }
}
