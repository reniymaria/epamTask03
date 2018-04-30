package by.epam.task03.service;

import by.epam.task03.entity.*;

public class Aviacompany {

    public Plane createAirbus(){
        AirbusA310 airbus = new AirbusA310();
        airbus.setName("Airbus A310");
        airbus.setFlyingDistance(123);
        airbus.setFuelCapacity(564);
        airbus.setPeopleCount(345);
        airbus.setWeightCapacity(7757);
        airbus.setWingLength(555);
        return airbus;
    }
    public Plane createBoeing(){
        Boeing737 boeing = new Boeing737();
        boeing.setName("Boeing 737");
        boeing.setFlyingDistance(1623);
        boeing.setFuelCapacity(5564);
        boeing.setPeopleCount(3545);
        boeing.setWeightCapacity(747);
        boeing.setEngines(4);
        return boeing;
    }
    public Plane createSuperJet(){
        SuperJet100 superJet = new SuperJet100();
        superJet.setName("Super Jet 100");
        superJet.setFlyingDistance(153);
        superJet.setFuelCapacity(56);
        superJet.setPeopleCount(35);
        superJet.setWeightCapacity(775677);
        superJet.setMaxSpeed(6000);
        return superJet;
    }

    public Plane createTU134(){
        TU134 tu134 = new TU134();
        tu134.setName("TU 134");
        tu134.setFlyingDistance(1263);
        tu134.setFuelCapacity(5654);
        tu134.setPeopleCount(3545);
        tu134.setWeightCapacity(77677);
        tu134.setBagegeCapacity(554);
        return tu134;
    }
}
