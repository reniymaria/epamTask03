package by.epam.task03.entity;

public class TU134 extends Plane {

    private int bagegeCapacity;

    public void setBagegeCapacity(int bagegeCapacity) {
        this.bagegeCapacity = bagegeCapacity;
    }

    public int getBagegeCapacity() {
        return bagegeCapacity;
    }

    @Override
    public String toString() {
        return "Plane " + getName() +
                ", people count = " + getPeopleCount() +
                ", weight capacity = " + getWeightCapacity() +
                ", flying distance = " + getFlyingDistance() +
                ", fuel capacity = " + getFuelCapacity() +
                ", bagege capacity = " + bagegeCapacity + "\n";
    }
}
