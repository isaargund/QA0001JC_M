package d26JavaPractice;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        /*
Get a number from the user
2.uuse Trnary
-if the entered number is even, print "Even Number" on the console
-if the entered number is odd, increase the number by 3 and print it on the console

Syntax of Ternary = condition ? (true) : (false)
 */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a numer");
        int num=input.nextInt();

        int finalNumber=0;
        Object o=num%2==0?"even number":num+3;
        System.out.println(o);
    }
}
