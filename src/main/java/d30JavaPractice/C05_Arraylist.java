package d30JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class C05_Arraylist {
    public static void main(String[] args) {
        //  1)  Create an ArrayList and add numbers into the ArrayList ====> 15, 20, 25, 30, 35, 40, 45, 50.
//  2)  Print all the elements of the ArrayList.
//  3)  Add the value 55 at the 5th index (as the 6th element) of the ArrayList.
//  4)  Calculate and print the sum of all even numbers in the ArrayList.
//  5)  Find and print the smallest and largest numbers in the ArrayList.
//  6)  Create a new ArrayList that contains all elements of the original ArrayList in reverse order and print this new ArrayList.

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        list.add(50);
        System.out.println(list);
        list.add(5,55);
        Integer evenSum=0;
        for (int w:list
             ) {
            if(w%2==0){
                evenSum+=w;
            }
        }
        System.out.println("Even sum= "+evenSum);
        int smallNumber=0;
        int bigNumber=0;

        for (int w:list
             ) {
            smallNumber=w;
            if (w<smallNumber){
                smallNumber=w;
            }
            if (w>bigNumber){
                bigNumber=w;
            }

        }


        System.out.println("small number: "+smallNumber+" big number: "+bigNumber);


        ArrayList<Integer> newArray=new ArrayList<Integer>();
        newArray.addAll(list);
        Collections.reverse(newArray);
        System.out.println(newArray);


    }
}
