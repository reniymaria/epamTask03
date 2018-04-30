package by.epam.task03.entity;

import java.util.Objects;

public class Plane {

    private String name;
    private int peopleCount;
    private double weightCapacity;
    private int flyingDistance;
    private double fuelCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public int getFlyingDistance() {
        return flyingDistance;
    }

    public void setFlyingDistance(int flyingDistance) {
        this.flyingDistance = flyingDistance;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return peopleCount == plane.peopleCount &&
                Double.compare(plane.weightCapacity, weightCapacity) == 0 &&
                flyingDistance == plane.flyingDistance &&
                Double.compare(plane.fuelCapacity, fuelCapacity) == 0 &&
                Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(peopleCount, weightCapacity, flyingDistance, fuelCapacity, name);
    }

}
