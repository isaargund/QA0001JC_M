package exercises;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a three char name");
       String name=input.next();
       char a=name.charAt(0);
       char b=name.charAt(1);
       char c=name.charAt(2);


     String  dublicat=name.length()==3?(a==b||b==c||c==a)?("Strin has dublicate character"):("String has unic character"):
             ("String has not valid number character");
        System.out.println(dublicat);




    }
}
