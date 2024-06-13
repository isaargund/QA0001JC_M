package d34JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        //        If the list contains the element 20, replace all occurrences of 20 with 2020 and
        //        then calculate
        //        the sum of all elements in the modified list.
//        list = [10, 20, 30, 20, 50]
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);
      int  sum=0;

        for (int w : list
        ) {
            if (w== 20) {


                list.set(list.indexOf(w), 2020);

            }

        }
        for (int w : list){
            sum += w;
        }
        System.out.println(sum);
        System.out.println(list);
    }}
