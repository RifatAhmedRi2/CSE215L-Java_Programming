/************************************************************************************
* (Average an array) Write two overloaded methods that return the average of an     *
* array with the following headers:                                                 *
* public static int average(int[] array)                                            *
* public static double average(double[] array)                                      *
* Write a test program that prompts the user to enter ten double values, invokes    *
* this method, and displays the average value.                                      *
*************************************************************************************/

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] values = new double[10];

		System.out.print("Enter ten values of double type: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

		System.out.println("The average value is: " + average(values));
	}

    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }
}