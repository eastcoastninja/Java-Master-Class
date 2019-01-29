package com.julianrios;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        * Sort an array in descending order
        * Numbers are read in from the keyboard
        * Implement 3 methods getIntegers, printArray, and sortIntegers
        * getIntegers returns an array of entered integers from keyboard
        * printArray prints the contents of the array
        * sortIntegers sort the array and return a new array containing the sorted numbers
        *
        * Tips copy the passed array elements into new array, sort them, and return new sorted array. Loop?
        *
        * */

        int[] ints = getIntegers(5);

        int[] sortedInts = sortedArray(ints);
//        int[] sorted = sortIntegers(ints);
        printArray(sortedInts);

    }

    /*
    * Pass in the size of the array *number*
    * Loop through array assigning element to = scanner.nextInt => entered number
    * returns an array
    * */
    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " numbers:\r");

        int[] myInts = new int[capacity];

        for(int i=0; i< myInts.length; i++) {
            myInts[i] = scanner.nextInt();
        }

        System.out.println("Array before Bubble Sort:");

        for(int i= 0; i < myInts.length; i++) {
            System.out.print(myInts[i] + " ");
        }
        System.out.println();
        return myInts;
    }


    /*
    * Accepts an array, sorts through comparing(bubble sort), assign values from highest to lowest
    * return array
    * */

    public static int[] sortedArray(int[] unSortedArray) {

        int n = unSortedArray.length;
        int temp;
        int[] sortedArray;

        for(int i= 0; i < n; i++) {
            // loops to next element
            for(int j= 1; j < (n-i); j++){
                // compares each element to it's neighbor if the first element value is lower it is swapped
                if(unSortedArray[j-1] < unSortedArray[j]) { // checks n < n+1
                    //swap elements
                    temp = unSortedArray[j-1]; // first element value set to temp to swap places
                    unSortedArray[j-1] = unSortedArray[j]; //assign second element value to the first element in the sorted array
                    unSortedArray[j] = temp; // assign the first element value to the second element
                }
            }
        }

        sortedArray = unSortedArray;
        return sortedArray;
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i =0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    /*
    * Accepts an array of type int
    * Loops through the array printing each element
    * */

    public static void printArray(int[] array) {
        System.out.println("Array after Bubble Sort:");
        for(int i= 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
