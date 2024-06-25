package D38Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println(myList);
        ExceptE(myList);

    }
    public static void ExceptE( List<String> myList){
        myList.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.print(" "+t));
    }
}
