package exercises;

import java.util.Arrays;

public class GitM {
    public static void main(String[] args) {
        String jkl="abuzer";
        String reverse="";
        for (int i=jkl.length()-1; i>=0; i--){
            reverse=reverse+jkl.charAt(i);
            System.out.println(reverse);
        }
        String [] reversedArray = reverse.split(    "");
        System.out.println(Arrays.toString(reversedArray));

    }
}
