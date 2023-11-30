package com.example;

public class ArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print an Array
        String[] word = args;
        // TODO: Initialize an array of integers and print its contents.
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int[] testArray = array;
        int max = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] > max) {
                max = testArray[i];
            }
        }
        return max; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        // TODO: Implement the logic to check if the array contains the specified value.
        int num = value;
        int[] testArray = array;
        for (int i = 0; i < testArray.length-1; i++) {
            if (testArray[i] == num) {
                return true;
            }
        }
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        // TODO: Implement the logic to calculate the average of the array elements.
        int[] testArray = array;
        int sum = 0;
        for (int i = 0; i < testArray.length; i++) {
            sum += testArray[i];
        }
        return sum/testArray.length; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        // TODO: Implement the logic to reverse the array.
        int[] testArray = array;
         int[] reverse = new int[testArray.length];
         int j = 0;
         for (int i = testArray.length - 1; i > -1; i--) {
             reverse[j] = testArray[i];
             j++;
         }
        return reverse; // Placeholder return value
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        int[] testArray = array;
        int jordan = 0;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length - 1; j ++) {
                if (testArray[j] > testArray[j + 1]) {
                    jordan = testArray[j];
                    testArray[j] = testArray[j + 1];
                    testArray[j + 1] = jordan;
                }
            }
        }
        // TODO: Implement a sorting algorithm to sort the array.
    }
}
