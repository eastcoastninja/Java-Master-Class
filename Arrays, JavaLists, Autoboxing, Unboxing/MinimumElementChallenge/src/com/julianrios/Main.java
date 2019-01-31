package com.julianrios;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * readIntegers(int count) count = how many integers the user needs to enter
		 *
		 * readIntegers() needs to read from the console until all the numbers are entered
		 * and then return an array containing the numbers entered
		 *
		 * findMin(int[] array) returns the minimum value in the array
		 *
		 * In main() read the count from the console and call readIntegers() passing count
		 * Then call the findMin() passing the array returned from readIntegers()
		 *
		 * print the minimum element in the array
		 *
		 * Tips:
		 * Assume the user will only enter numbers never letters
		 * Create a scanner as a static field
		 * */
		System.out.println("Enter count:");
		int count = scanner.nextInt();
		int[] myArray = readIntegers(count);
		int min = findMin(myArray);
		printMin(min);
	}

	/*
	* Reads numbers from the console
	* @returns an array
	* */
	private static int[] readIntegers(int count) {

		System.out.println("Enter " + count + ": numbers. \r");

		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Your numbers are: " + Arrays.toString(array));
		return array;
	}

	/*
	* Accepts an array, bubble sort(ascending order)
	* @returns lowest value at index [0]
	* */
	private static int findMin(int[] array) {

		// sort from lowest to highest return value at [0]

		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 1; i < array.length; i++) {
//				System.out.println("comparing " + array[i] + " and " + array[i - 1]);

				/*
				 * if the element on the left is bigger then the one we are currently looking at
				 * swap that element with its left neighbor
				 * Compares right to left
				 * */

				if (array[i - 1] > array[i]) {
					isSorted = false;
//					System.out.println("Swapping " + array[i] + " and " + array[i - 1]);

					int tempReference = array[i - 1];
					array[i - 1] = array[i]; // moves left
					array[i] = tempReference; // moves right
				}
			}
		}
//		System.out.println("Sorted: " + Arrays.toString(array));
		return array[0];
	}

	/*
	* Accepts an array
	* Prints out element at index[0]
	* */
	private static void printMin(int min) {
		System.out.println("Minimum element is: " + min);
	}
}