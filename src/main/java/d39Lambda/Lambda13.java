package d39Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda13 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);
       // removeIfGreaterThanFive(myList);
        System.out.println(myList);
        //deletwith(myList);
        System.out.println(myList);
        removeContainsI(myList);




    }
    //Example : delete the elements whose length are greater than 5

    public  static  void reoveIfGreaterThanFive(List<String> myList){
        myList.removeIf(t->t.length() > 5);
        System.out.println(myList);
    }
    //Example : delete the elements which starts with j or and with f
    public static void deletwith(List<String> list){
        list.removeIf(t->t.startsWith("j")|| t.endsWith("f"));//[Ali, Zeynep, Mustafa]

    }
    public static void removeContainsI(List<String> list){
        list.removeIf(t->t.contains("i"));
        System.out.println(list);
    }
}
