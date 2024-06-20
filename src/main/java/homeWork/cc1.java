package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cc1 {
    public static void main(String[] args) {
        //        Type the code that shows the count of unique elements in a list of strings.
//        Example: {"apple", "banana", "apple", "orange", "banana", "apple"} ==> 3


    List<String> list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

    List<String>uniqueList= new ArrayList<String>();
        for (String word : list

        ){if (!uniqueList.contains(word)){
            uniqueList.add(word);

        }

        }
        System.out.println(uniqueList.size());







    }
}
