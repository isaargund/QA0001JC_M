package d26JavaPractice;

import java.util.Scanner;

public class C08_WhileLoops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("please enter a number");
            int num=scan.nextInt();
            if((num%10)==0){
                break;
            }else {
                sum+=num;
            }


        }
        System.out.println(sum);
    }
}
