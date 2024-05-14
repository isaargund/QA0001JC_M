package d16Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String[] cities=new String[5];
        cities[0] = "Batman";
        cities[1] = "Istanbul";
        cities[2] = "Berlin";
        cities[3] = "Frankfurt";
        cities[4] = "milano";
        System.out.println(Arrays.toString(cities));

        System.out.println("================================");

        for (int i=0; i<cities.length; i++) {
            System.out.println(cities[i]);
        }
        System.out.println("================================");

        //2.way for each loop(enchanced loop)
        //for (elemental data type aname:arrayname/CollectionName) {....
        // .......}
        for (String c:cities){
            System.out.println(c);
        }



    }
}
