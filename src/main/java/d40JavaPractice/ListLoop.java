package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListLoop {/*

 Stores the names of students in a class. This program should perform the following steps:

Take 5 student names as input from the user and add them to an ArrayList.
Print all the student names.


 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("please enter student names");
            String student=input.nextLine();
            names.add(student);
        }
        System.out.println(names);

    }
}