package d4Scanner_Concatenation;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);

        System.out.println("please enter your full name");//i wanna get multiple names from users so thats wyh i use nextline
       //
        String fullName=entry.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("please enter your age");
        int age=entry.nextInt();
        System.out.println("age = " + age);
        System.out.println("please enter your height");
        float height=entry.nextFloat();
        System.out.println("height = " + height);
        System.out.println("please enter your marital status");

       // String maritalStatus=entry.nextLine();
        String status=entry.next();//this method allows java take one word only
        System.out.println("status = " + status);
        
        

    }
}
