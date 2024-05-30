package d26JavaPractice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Get the user's weight and height then print their body index.....
        Scanner scan=new Scanner(System.in);
        System.out.println("please add your weight(kg) and height(cm)");
        int weight=scan.nextInt();
        int height=scan.nextInt();

        int bodyIndex=weight/(height*height/100);

    }


}
