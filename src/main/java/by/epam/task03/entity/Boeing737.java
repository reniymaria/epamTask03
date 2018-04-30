package by.epam.task03.entity;

public class Boeing737 extends Plane{


    private int engines;


    public void setEngines(int engines) {
        this.engines = engines;
    }

    public int getEngines() {
        return engines;
    }

    @Override
    public String toString() {
        return "Plane " + getName() +
                ", people count = " + getPeopleCount() +
                ", weight capacity = " + getWeightCapacity() +
                ", flying distance = " + getFlyingDistance() +
                ", fuel capacity = " + getFuelCapacity() +
                ", engines = " + engines + "\n";
    }
}
