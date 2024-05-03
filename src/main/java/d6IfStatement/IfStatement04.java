package d6IfStatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        //Example: Ask user to enter number of the day in a week and print name of day
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of the day");
        int day = input.nextInt();
        if (day == 1) {
            System.out.println("day is monday");
        } else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("thursday");
        } else if (day == 5) {
            System.out.println("friday");
        } else if (day == 6) {
            System.out.println("saturday");
        } else if (day == 7) {
            System.out.println("sunday");
        }else {
            System.out.println("you gave a wrong number");
        }


    }
}
