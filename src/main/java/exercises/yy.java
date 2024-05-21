package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class yy {
    public static void main(String[] args) {
        //Example; Create an integer list
//find the closest element in the list
// [12,23,10,19]  ==> 10 and 12  ===> 12-10=2
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(23);
        list.add(10);
        list.add(19);

        System.out.println(list);//[12, 23, 10, 19]
        System.out.println("==============================================================0");
            list.sort(null);
        System.out.println(list);//[10, 12, 19, 23]
        System.out.println("==============================================================0");


        Collections.sort(list);
        System.out.println(list);//[10, 12, 19, 23]





    }
}
