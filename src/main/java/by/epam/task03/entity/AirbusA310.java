package by.epam.task03.entity;

public class AirbusA310 extends Plane{

    private int wingLength;

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return "Plane " + getName() +
                ", people count = " + getPeopleCount() +
                ", weight capacity = " + getWeightCapacity() +
                ", flying distance = " + getFlyingDistance() +
                ", fuel capacity = " + getFuelCapacity() +
                ", wing length = " +  wingLength + "\n";
    }
}
