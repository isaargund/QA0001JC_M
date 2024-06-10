package d31Maps_Exceptions;

import d29_Collections.Maps;

import java.util.ArrayList;
import java.util.Arrays;

public class Map03 {
    public static void main(String[] args) {
        // Example 1: Write code that shows how many times each word is used in a given String.
        //            The operation should be case-insensitive.
        // Mike is Mike.  => mike is mike ==> mike, is, mike
        // expected result => {mike=2, is=1} => map

        String s = "Mike is Mike.";
      s=  s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println("s = " + s);
        String[] words = s.split(" ");





        System.out.println(Arrays.toString(words));


        ArrayList<String> words2 = new ArrayList<String>();

        for (String w:words
             ) {
                words2.add(w);
        }
        System.out.println(words2);

    }
}
