package by.epam.task03.service;

import by.epam.task03.entity.Plane;

import java.util.ArrayList;
import java.util.List;

public class SearchingPlane {

    public static final String NOTHING_IS_FOUND = "Nothing is found";
    public static final String INCORRECT_VALUE = "Incorrect value is entered ";

    public static List<Plane> findByFuelCapacity(double fromValue, double toValue, List<Plane> planes) throws IncorrectValueException {
        if (!checkValues(fromValue, toValue)) {
            throw new IncorrectValueException(INCORRECT_VALUE, fromValue, toValue);
        }
        List<Plane> findPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getFuelCapacity() >= fromValue && plane.getFuelCapacity() <= toValue) {
                findPlanes.add(plane);
            }
        }
        if (!isEmpty(findPlanes)) {
            System.out.println(NOTHING_IS_FOUND);
        }
        return findPlanes;
    }

    private static boolean checkValues(double fromValue, double toValue) {
        if (fromValue > toValue) {
            return false;
        }
        return true;
    }

    private static boolean isEmpty(List<Plane> planes) {
        if (planes.size() == 0) {
            return false;
        }
        return true;
    }
}
