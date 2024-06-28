package d40JavaPractice;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        /*

Takes two numbers from the user representing a range and prints all the even numbers between those two numbers (inclusive).
The program should use a for loop to accomplish this task.


 */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter two number ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if (num1 < num2) {
            for (int i=num1; i<num2+1; i++) {
                if(i%2 == 0) { System.out.print(" "+i);}

            }
        }else {
            for (int i=num2; i<num1+1; i++) {
                if(i%2 == 0) { System.out.print(" "+i);}            }
        }

    }
}
