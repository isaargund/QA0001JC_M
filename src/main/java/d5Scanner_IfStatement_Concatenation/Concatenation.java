package d5Scanner_IfStatement_Concatenation;

public class Concatenation {
    public static void main(String[] args) {

        //Example: Create a String and two int data
// Then Print the total value of them on the console
      //  int a =35;
      //  int b =10;
      //  String fruit = "apple";
        //System.out.println("total fruits ar:"+(a + b));

        //Example: Create a String and two int data
        // Then Print the total value of int data on the console

        String fruit = "Apple";

        int a = 10;
        int b = 25;

        System.out.println(fruit + a + b); //Apple1025
        System.out.println(fruit + (a + b)); //Apple35
        System.out.println(fruit + a * b); //Apple250
        System.out.println(a + b  + fruit); //35Apple
        System.out.println(a + fruit + b); //10Apple25


    }
}
