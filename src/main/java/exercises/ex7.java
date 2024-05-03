package exercises;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        /*
        Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
 Sample:
INPUT       : Mustafa
OUTPUT      : fafafa
         */

        Scanner input=new Scanner(System.in);
        String name=input.next();
        String str=name.substring(name.length()-2);
       String result2=str+str+str;
        System.out.println(result2);


        System.out.println("================================================================");
        System.out.println("Enter a word");
        String word = input.nextLine();
        String result =  (word.length() >= 2) ? (word.substring(word.length() - 2)
                +word.substring(word.length() - 2)
                +word.substring(word.length() - 2)) :"There must be atleast 2 letters";
        System.out.println(result);


    }
}
