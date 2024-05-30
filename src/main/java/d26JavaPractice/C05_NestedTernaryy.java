package d26JavaPractice;

import java.util.Scanner;

public class C05_NestedTernaryy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter two number");

        int num1= scan.nextInt();
        int num2= scan.nextInt();
        Object result=num1==num2?"Numbers are equel":num2>num1?num2*num2:num1*num1;
        System.out.println(result);
    }
}
