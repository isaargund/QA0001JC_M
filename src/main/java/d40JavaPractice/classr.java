package d40JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class classr {
    public static void main(String[] args) {
              /*

 write codes that manages a list of students' names. The codes should:
get the number of students

Add several student names to an ArrayList.
Use a for-each loop to print each student's name in the list.
Count how many students have names starting with the letter 'A' and print the count.
         */

        List<String> students = new ArrayList<String>();
        Scanner input=new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            String name = input.nextLine();
            students.add(name);
        }
        int countNameWithE =0;
        for (String w:students
             ) {
            System.out.println(w);
            if (w.startsWith("A")){
                countNameWithE++;
            }

        }

        System.out.println("countNameWithE = " + countNameWithE);
    int[] array={2,3,5,7};
        System.out.println(Arrays.toString(array));

    }
}
