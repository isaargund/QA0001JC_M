package D38Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);
        tt(myList);// Zeynep Mustafa

    }
    public static void tt(List<String> myList) {
        myList.stream().distinct().filter(t->t.length()>5).forEach(t-> System.out.print(" "+t));

    }
}
