package d30JavaPractice;

public class C06_MethodCreation {
    // Write a method that takes three int parameters and calculates their sum, difference, multiply, and average.
// Then, write a program that calls these methods and prints all the results.
//// Define three numbers in Runner class
       int a = 10;
      int b = 5;
        int c = 2;
    public   int sum(int a, int b, int c) {
        int sum=a+b+c;
        return sum;

    }
    public  int difference(int a, int b, int c){
        int difference=a-b-c;
        return difference;
    }
    public  int multiply(int a, int b, int c){
        int multiply=a*b*c;
        return multiply;
    }
    public  int average2(int a, int b, int c){
        int average=(a+b+c)/3;
        return average;
    }
}
