package d26JavaPractice;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=input.nextInt();
        if (n<0){
            System.out.println("negative number");
        } else if (n>-1) {
            if (n<10) {
                System.out.println("digit numbr");
            }else {
                System.out.println("positive number");
            }

        }
    }
}
