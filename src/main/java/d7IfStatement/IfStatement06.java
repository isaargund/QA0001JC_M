package d7IfStatement;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {
        //example: the information provide by customer:
        //if it female
        //and greater than 60,print "she can retire"
        //if it is younger than 60,print "she can continue to work"
        //if it is male
        //and if greater than 65, print "he can retire"
        //if it is younger than 65, print "he can continue to work"
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender = input.next();
        if (gender.equalsIgnoreCase("male")) {

            System.out.println("please enter your age");

            int maleAge= input.nextInt();

            if (maleAge>65){

                System.out.println("you can retire");

            }else {
                System.out.println("you can stay at work");
            }


        }

        if (gender.equalsIgnoreCase("female")) {
            System.out.println("please enter your age");
            int femaleAge= input.nextInt();
            if (femaleAge>60){
                System.out.println("you can retire");
            }else {
                System.out.println("you will work");
            }



        }
    }
}
