package d6IfStatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

//Example check the given number by user if it is negative, positive, neuter/zero
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("please enter a number");

        if (number < 0) {
            System.out.println("number is negative");
        }else if (number > 0) {
            System.out.println("number is positive");

        }else {
            System.out.println("number is neuter" );
        }
    }
}
