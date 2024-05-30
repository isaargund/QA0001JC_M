package d26JavaPractice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please give two numbers" );
        int num1=input.nextInt();
        int num2=input.nextInt();
        if (num1>0&&num2>0) {
            System.out.println(num2+num1);
        }else if (num1<0&&num2<0) {
            System.out.println(num1*num2);
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("absording number");
        } else {
            System.out.println("operation with numbers cannot performed");
        }

    }


}
