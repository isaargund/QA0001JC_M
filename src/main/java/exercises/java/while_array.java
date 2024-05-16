package exercises.java;

import java.util.Arrays;

public class while_array {
    public static void main(String[] args) {

        String str= "Javaisalsoeasy";
        String str2= "";
        for (int i=0; i<str.length(); i++) {
            if (str.indexOf(i)!=str.lastIndexOf(i)){
                str2+=str.charAt(i);

            }
        }
        String []arr=str2.split("");
        System.out.println(Arrays.toString(arr));

        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
Input :
String str=“Javaisalsoeasy”
Output: [a, s]
         */


    }
}
