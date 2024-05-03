package d5Scanner_IfStatement_Concatenation;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {
        //type main method

//Example: type code gets mile from the user then converts it to kilometers
// 1 mile is 1.6 km
        Scanner input = new Scanner(System.in);
        System.out.println("please enter miles");
        double distance = input.nextDouble();
        double km=distance*1.6;
        System.out.println("km = " + km);
        
    }
}
