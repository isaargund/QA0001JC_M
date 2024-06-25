package d39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda12 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);
        sortElementsWithLenght(myList);
    }
    public static  void sortElementsWithLenght(List<String> list) {
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->t.length()))
                .forEach(t-> System.out.print(t+" "));
    }
    public static void newMethod(List<String> list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted()
                .forEach(Utills::printInTheSameLineWithSpace);
    }
}

