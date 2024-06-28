package d40JavaPractice;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        /*

        Calculate the discount rate based on customer points in a store. T
        he discount rates based on points are as follows:

        0 - 99 points: 0% discount
        100 - 199 points: 5% discount
        200 - 299 points: 10% discount
        300 - 399 points: 15% discount
        400 and above points: 20% discount
        Take the customer's points and the purchase amount as input.
        Use a switch statement to determine the discount rate and calculate
        the final amount after applying the discount.



*/
        Scanner input=new Scanner(System.in);
        System.out.println("please  customer point");
        int customerPoints=input.nextInt();
        System.out.println("please enter purchase amount ");
        double purchaseAmount=input.nextInt();
            int points=customerPoints/100;
            if (points>4){
                points=4;
            }

        switch (points){
            case (0):
                purchaseAmount=purchaseAmount;

                        break;
            case (1):
                purchaseAmount=purchaseAmount*0.95;
                break;

            case (2):
                purchaseAmount=purchaseAmount*0.9;
                break;

            case (3):
                purchaseAmount=purchaseAmount*0.85;
                break;

            case (4):
                purchaseAmount=purchaseAmount*0.8;
                break;
        }
        System.out.println(purchaseAmount);

    }
}
