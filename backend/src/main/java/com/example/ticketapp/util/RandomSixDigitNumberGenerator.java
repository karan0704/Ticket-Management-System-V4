package com.example.ticketapp.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomSixDigitNumberGenerator {

    private static final int MIN_VALUE = 100000;
    private static final int MAX_VALUE = 999999;

    private static Set<Integer> generatedNumbers = new HashSet<>();

    private RandomSixDigitNumberGenerator() {
        // Private constructor to prevent instantiation
    }

    public static int generateUniqueNumber() {
        Random random = new Random();
        int number;
        do {
            number = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
        } while (!isUnique(number));

        generatedNumbers.add(number);
        return number;
    }

    private static boolean isUnique(int number) {
        return !generatedNumbers.contains(number);
    }
}
