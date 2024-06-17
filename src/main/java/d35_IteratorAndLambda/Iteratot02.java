package d35_IteratorAndLambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratot02 {
    public static void main(String[] args) {
        //Create an ArrayList from List interface
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList); // [Tom, Jim, Clara, Fatma, Mustafa]


//lets apply iterator to myList : created an iterator on the existing.....
        Iterator<String> myItr = myList.iterator();

//Please delete only clara....

        while (myItr.hasNext()) {
            if (myItr.next()=="Clara") {
                myItr.remove();
            }
        }
        System.out.println(myList);//[Tom, Jim, Fatma, Mustafa]
    }
}
