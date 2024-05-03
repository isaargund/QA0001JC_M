package d7IfStatement;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Exapmle: when the users enters number of month, print the related month name and month names after the month

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("it is not a valid month name");

        }


    }
}
