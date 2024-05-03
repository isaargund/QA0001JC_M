package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println("total: "+(num1+num2));
        System.out.println("differance: "+(num1-num2));
        System.out.println("multiplication:"+(num1*num2));
        System.out.println("division"+String.format("%.2f",(num1/num2)));//we made it for not to get 0.666666666666




    }
}
