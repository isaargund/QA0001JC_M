package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lk {
    public static void main(String[] args) {
        //    Type code that finds the smallest number in a list and adds this number to
        //    both the beginning and the end of the list.
//    If the list is empty, print "The list is empty".
//    10,5,30,20,50

List<Integer> list =new ArrayList<Integer>(Arrays.asList(10,5,30,20,50));

    Integer min=Integer.MAX_VALUE;
        for (int w:list
             ) {
            if (list.isEmpty()) {
                System.out.println("list is empty");
            }
            else if (w <min)
            {
                min = w;
            }
        }
        list.add(min);
        list.add(0, min);

        System.out.println(list);






    }
}
