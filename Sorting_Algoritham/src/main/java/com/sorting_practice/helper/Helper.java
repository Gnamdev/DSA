package com.sorting_practice.helper;

public class Helper {

    // Generic method
    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

}
