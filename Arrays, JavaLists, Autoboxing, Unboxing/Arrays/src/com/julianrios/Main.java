package com.julianrios;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Main j = new Main();

//        int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
//        myIntArray[5] = 50;

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

        // can use for hamburger additions method for printing?
//        for(int i = 0; i < myIntArray.length; i++) {
//            System.out.println(myIntArray[i]);
//        }

//        j.printArray(myIntArray);
//        printArray(myIntArray);
    int[] myIntegers = getIntegers(5);

    for(int i = 0; i < myIntegers.length; i++) {
        System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
    }

    System.out.println("The average is " + getAverage(myIntegers));
    }

    /*
    * User inputs a number which defines the size of the array.
    * For loop cycles through each element assigning a value with scanner.nextInt which accepts a number input
    * @return the array
    * */
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r" ); // \r returns to the next line
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt(); // accepts an int from the console and it is stored in each element of the array
        }

        return values;
    }

    /*
    * Calculates the average sum of the array
    * return double in case not a whole number
    * */
    public static double getAverage(int[] array) {
        int sum =0;
        for(int i =0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    /*
    * Initialize and prints each element of the array passed in
    * */
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) { // array.length == 25
            array[i] = i*10;
            System.out.println(array[i]);
        }
    }
}
