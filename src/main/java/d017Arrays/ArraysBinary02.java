package d017Arrays;

import java.util.Arrays;

public class ArraysBinary02 {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6}; //give me the index number of 5 and 3......
        //1) I NEED TO USE SORT METHOD()....

        Arrays.sort(arr); //sorted in asceding.....

        System.out.println("Sorted arr =" + (Arrays.toString(arr))); // [1, 2, 3, 5, 6]

        int indexOf5 = Arrays.binarySearch(arr, 0);
        System.out.println("indexOf5 = " + indexOf5);

        System.out.println("Arrays.binarySearch(arr ,5) = " + Arrays.binarySearch(arr, 5));

        int indexOf3 = Arrays.binarySearch(arr, 3); //-3
        System.out.println("indexOf5 = " + indexOf3);



//example; Print the number of words in the given sentece....

        String s = "Java is easy Learn java earn money";
        String[] b = s.split(" ");
        int words = b.length;
        System.out.println("words = " + words);
        System.out.println(Arrays.toString(b));
    }
}
