package homeWork;

import java.util.Scanner;

public class fak {
    public static void main(String[] args) {
        //Write a code  that calculates the factorial of a given number from user
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int factorial=1;

        for (int i=1; i<=num; i++) {
            factorial*=i;

        }
        System.out.println(factorial);

    }
}
