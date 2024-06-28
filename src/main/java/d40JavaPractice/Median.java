package d40JavaPractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        //        get the user to enter a positive integer n and then creates an array
        //        of n elements filled with random numbers.
        //       In this array:
//
//        Find and print the median of the array.
//        Find and print the second smallest and second largest elements of the array.

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter how many elements do you want");
        int n=scan.nextInt();
        double[]elements = new double[n];


        for (int i=0; i<n; i++){
            elements[i]= Math.random();
        }
        System.out.println(Arrays.toString(elements));
        Arrays.sort(elements);

            if (elements.length%2==0){

            }
    }
}
