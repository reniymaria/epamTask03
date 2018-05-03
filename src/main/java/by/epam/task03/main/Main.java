package by.epam.task03.main;

import by.epam.task03.entity.*;
import by.epam.task03.service.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Plane> plains = new ArrayList<>();
        Aviacompany createPlanes = new Aviacompany();

        Plane plane1 = createPlanes.createAirbus();
        Plane plane2 = createPlanes.createBoeing();
        Plane plane3 = createPlanes.createSuperJet();
        Plane plane4 = createPlanes.createTU134();

        plains.add(plane1);
        plains.add(plane2);
        plains.add(plane3);
        plains.add(plane4);

        System.out.println("Common weight capacity: ");
        System.out.println(SumValue.sumWeightCapacity(plains));

        System.out.println("Common people count: ");
        System.out.println(SumValue.sumOfPeople(plains));


        System.out.println("Planes sorted by distance: ");
        FlyingDistanceSort flyingDistanceSort = new FlyingDistanceSort();
        Collections.sort(plains, flyingDistanceSort);
        System.out.println(plains);

        System.out.println("Find planes of fuel capacity range: ");
        try {
            System.out.println(SearchingPlane.findByFuelCapacity(40, 600, plains));

            System.out.println("Exceptional situation with logger: ");
            System.out.println(SearchingPlane.findByFuelCapacity(4000, 600, plains));
        } catch (IncorrectValueException e) {
            e.printStackTrace();
        }
    }
}
