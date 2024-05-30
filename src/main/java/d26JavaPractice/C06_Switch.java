package d26JavaPractice;

import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {

        /*
        ask the user to enter his or her grade between 0-4
        if the grade between 0.-01: print fail..
        if the grade between 1-2: print pass
        if the grade between2.0- 2.5 print good..
        if the grade between 2.5-3.5 print Brtter
        if the grade between 3.5-4 print Great
        then assing the letter grades using switch case
        Fail=
        FAIL = F
PASS = D
GOOD = C
BETTER = B
GREAT = A
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("give your grade");
        double grade=scan.nextDouble();
        String res="";
        if (grade<0||grade>4){
            System.out.println("grade is not correct");
        } else if (grade<=0&&grade<=1) {
            res=res+"fail";
            System.out.println("fail");

        } else if (grade>1&&grade<2) {
            System.out.println("pass");
            res=res+"pass";

        } else if (grade>2&&grade<2.5) {
            System.out.println("good");
            res=res+"good";

        } else if (grade>2.5&&grade<3.5) {
            System.out.println("better");
            res=res+"better";

        }else {
            System.out.println("great");
            res=res+"great";
        }
        switch (res){
        case "fail":
            System.out.println("F");
            break;
            case "pass":
                System.out.println("D");
                break;
            case "good":
                System.out.println("C");
                break;
            case "better":
                System.out.println("B");
                break;
            case "great":
                System.out.println("A");
                break;
    }
}}
