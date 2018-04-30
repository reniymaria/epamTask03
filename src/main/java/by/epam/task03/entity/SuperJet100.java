package by.epam.task03.entity;

public class SuperJet100 extends Plane {

    private double maxSpeed;

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Plane " + getName() +
                ", people count = " + getPeopleCount() +
                ", weight capacity = " + getWeightCapacity() +
                ", flying distance = " + getFlyingDistance() +
                ", fuel capacity = " + getFuelCapacity() +
                ", max Speed = " + maxSpeed + "\n";
    }

}
