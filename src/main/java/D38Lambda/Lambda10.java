package D38Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda10 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);

        System.out.println("keepElementsHigherThenFive(myList) = "
                + keepElementsHigherThenFive(myList));//keepElementsHigherThenFive(myList) = [ZEYNEP, MUSTAFA]

    }

    /*
    Create a method returning version of the list as follows:
    Must contain elements whose lenght greater than 5
    Must contain elements all converted to uppercase
    must return as a list as well....
     */
    public static List<String> keepElementsHigherThenFive(List<String>  myList){
   List<String> newList=     myList.stream().filter(t->t.length()>5).map(t->t.toUpperCase()).collect(Collectors.toList());

        return newList;
    }
}
