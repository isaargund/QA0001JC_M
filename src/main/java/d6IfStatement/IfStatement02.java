package d6IfStatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //example check number given by the user is even or odd number

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number%2==0 ){
            System.out.println("number = even " + number);
        }
        if (number%2!=0){
            System.out.println("number = odd " + number);
        }




    }
}
