package by.epam.task03.service;

import by.epam.task03.entity.Plane;

import java.util.List;

public class SumValue {

    public static int sumOfPeople(List<Plane> planes) {
        int commonSum = 0;
        for(Plane plane: planes){
            commonSum = commonSum + plane.getPeopleCount();
        }
        return commonSum;
    }

    public static double sumWeightCapacity(List<Plane> planes){
        double commonSum = 0;
        for(Plane plane: planes){
            commonSum = commonSum + plane.getWeightCapacity();
        }
        return commonSum;
    }
}
