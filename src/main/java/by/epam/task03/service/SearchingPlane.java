package by.epam.task03.service;

import by.epam.task03.entity.Plane;

import java.util.ArrayList;
import java.util.List;

public class SearchingPlane {

    public static final String NOTHING_IS_FOUND = "Nothing is found";

    public static List<Plane> findByFuelCapacity(double fromValue, double toValue, List<Plane> planes) {
        List<Plane> findPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getFuelCapacity() >= fromValue && plane.getFuelCapacity() <= toValue) {
                findPlanes.add(plane);
            }
        }
        if(!isEmpty(findPlanes)){
            System.out.println(NOTHING_IS_FOUND);
        }
        return findPlanes;
    }

    private static boolean isEmpty(List<Plane> planes) {
        if (planes.size() == 0) {
            return false;
        }
        return true;
    }
}
