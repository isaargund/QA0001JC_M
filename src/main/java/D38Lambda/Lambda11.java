package D38Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda11 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);
        System.out.println("ss(myList) = " + ss(myList));//ss(myList) = [ali , elif , mustafa , yusuf , zeynep ]
    }

    public static List<String> ss(List<String> list) {
      List<String> newList=  list.stream().distinct().map(t->
              t.toLowerCase()).sorted().collect(Collectors.toList());
        for (String w : newList
             ) {
          String  b=w+" ";
            newList.set(newList.indexOf(w),b);

        }
      return newList;
    }
}
