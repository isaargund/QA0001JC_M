package d40JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class C14_List {           /*

      Create a list.

Add numbers from 1 to 15.
Then, double the elements that are greater than 10.
Example:
Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30



       */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 16; i++) {
            list.add(i);
        }
        for (int w:list
             ) {
            if(w>10){
                list.set(list.indexOf(w),w*2);
            }


        }
        System.out.println(list);
    }
}
