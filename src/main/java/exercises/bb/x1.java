package exercises.bb;

import java.util.Scanner;

public class x1 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
input : ade1r4d3
output : 8
 Hint :
 Use Character.isDigit()
 Integer.valueOf()
         */

        int a=cont();
        System.out.println(a);


    }
    public  static  int cont(){
        Scanner input=new Scanner(System.in);
        String a=input.next();

        String num=a.replaceAll("[^0-9]", "");
        System.out.println(num);
        Integer b=Integer.valueOf(num);
        System.out.println(b);
        int i=0;
        while (b>0){
            i=i+b%10;
            b=  b/10;

        }

       return i;

    }
    }
