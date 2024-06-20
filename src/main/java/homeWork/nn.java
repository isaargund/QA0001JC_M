package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class nn {
    public static void main(String[] args) {

//        Write a code that prints the longest word in a sentence taken from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("give a sentence");
        String sentence=input.nextLine();
        String[] words = sentence.split(" ");
        String lonWord ="";
        for (String w : words
        ) {
            if (w.length()>lonWord.length()) {
                lonWord=w;

            }

        }

        System.out.println(lonWord);

    }
}
