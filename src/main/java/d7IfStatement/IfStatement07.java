package d7IfStatement;

import java.util.Scanner;

public class IfStatement07 {
    public static void main(String[] args) {
        //Example; based on the entered age, print the phase on the console

//0-4 ==> baby
//5-12 ==> child
//13-20 ==> teen
//21-40 ==> adult
// 41+ ==> middle age

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the age");

        int age = input.nextInt();
        if (age>-1&&age<5){
            System.out.println("it is  a baby");
        } else if (age>4&&age<13) {
            System.out.println("child");

        } else if (age > 12 && age < 21) {
            System.out.println("teen");
        } else if (age < 40 && age >20) {
            System.out.println("adult");

        } else if (age>40) {
            System.out.println("middle age");

        }else {
            System.out.println("invalid age");
        }
    }
}
