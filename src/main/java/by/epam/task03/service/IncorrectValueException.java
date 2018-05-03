package by.epam.task03.service;

import java.util.logging.Logger;

public class IncorrectValueException extends Exception {
    private static Logger log = Logger.getLogger(IncorrectValueException.class.getName());

    public IncorrectValueException(String message, double from, double to) {
        System.out.println(message + from + " should be less " + to);
        log.info("You entered incorrect value fromValue or toValue for Searching the plane");

    }
}
