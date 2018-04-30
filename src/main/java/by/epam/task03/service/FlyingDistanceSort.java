package by.epam.task03.service;

import by.epam.task03.entity.Plane;

import java.util.Comparator;

public class FlyingDistanceSort implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.getFlyingDistance() - o2.getFlyingDistance();
    }
}
