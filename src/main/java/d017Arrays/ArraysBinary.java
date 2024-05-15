package d017Arrays;

import java.util.Arrays;

public class ArraysBinary {
    public static void main(String[] args) {
        //Example 2 ; Check the string array if a specific data exist in the array or not.....
        String letters [] = {"W", "O", "R", "L", "D"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));//[D, L, O, R, W]
      int indexOFD = Arrays.binarySearch(letters,"D");//0
        System.out.println(indexOFD);
        int indexOfR = Arrays.binarySearch(letters,"R");//3
        System.out.println(indexOfR);
        int indexOfP = Arrays.binarySearch(letters, "P");  //

        System.out.println("indexOfP = " + indexOfP); //-4

        int indexOfE = Arrays.binarySearch(letters, "E");  //

        System.out.println("indexOfE = " + indexOfE); //-2

    }
}
