package com.julianrios;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,5,3,7,11,9,15};
        reverse(array);
    }

    /*
    * Accepts an array, sorts the array in reverse order,
    * and prints out original and reversed array
    * */

    private static void reverse(int[] array) {

        System.out.println("Original " + Arrays.toString(array));
        // Given solution
        /*
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i=0; i< halfLength; i++) {

            int temp = array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        */

        boolean isNotSwapped = true;
        while(isNotSwapped) {

            // n is the number of passes needed to swap all elements
            int n = (array.length/2);

            for(int i = 1; i <= n; i++) {

                int temp = array[i-1];
                array[i-1] = array[array.length-i];
                array[array.length-i] = temp;
            }

            isNotSwapped=false;
        }

        System.out.println("Reversed " + Arrays.toString(array));
    }
}
