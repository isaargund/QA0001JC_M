package d15nestedLoopWhileLoop;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        for (int i = 1;i<=cols;i++){

            for (int j = 1;j<=rows;j++){
                System.out.print("x");

            }
            System.out.println("");

        }




    }
}
