package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c22 {
    public static void main(String[] args) {

    /*
    Get integers from user
    Add several integers to an ArrayList.
Use a lambda expression to filter out and print all even numbers from the list.
Use a lambda expression to square each number in the list and print the result.
Use a lambda expression to find and print the sum of all numbers in the list.
     */
        List<Integer> nums=new ArrayList<>(); Scanner scan=new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("please enter a number");
            int num=scan.nextInt();
            nums.add(num);
        }
        nums.stream().filter(t->t%2==0).forEach(System.out::println);
        nums.stream().map(t->t*t).forEach(t->System.out.print(t+" "));
        System.out.println("nums.stream().reduce(0,(t,u)->t+u) = " + nums.stream().reduce(0, (t, u) -> t + u));


    }
}
