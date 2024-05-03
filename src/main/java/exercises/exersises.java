package exercises;

import java.util.Scanner;

public class exersises {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("please input a number, number cant be negative");
           long num1=input.nextLong();
        System.out.println("please input a number, number cant be negative");

        long num2=input.nextLong();
           long sum=num1+num2;
           if (num1<0&&num2<0){
               System.out.println("it is not a valid number");
           }else if(sum>10000000000L){
               System.out.println("overflow");
           }else {
               System.out.println(sum);
           }

        }
    }


