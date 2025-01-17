/**
 * Chapter 8 Exercise 13:
 *
 *      (Locate the largest element)
 *      Write the following method that returns the location of the
 *      largest element in a two-dimensional array.
 *
 *      public static int[] locateLargest(double[][] a)
 *
 *      The return value is a one-dimensional array that contains two elements.
 *      These two elements indicate the row and column indices of the largest
 *      element in the two-dimensional array. Write a test program that prompts
 *      the user to enter a two- dimensional array and displays the location of
 *      the largest element in the array.
 *
 * Created by Luiz Arantes Sa on 8/30/14.
 */

import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];

        System.out.println("Enter the array below: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                m[i][j] = input.nextDouble();

        int[] location = locateLargest(m);
        System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
    }

    public static int[] locateLargest(double[][] a) {

        int[] location = new int[] { 0, 0 };
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    location[0] = i; // row
                    location[1] = j; // column
                    largest = a[i][j];
                }
            }
        }

        return location;
    }
}