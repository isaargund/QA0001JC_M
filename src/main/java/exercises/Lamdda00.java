package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lamdda00 {
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]=("isa");
        name[1]=("Bonasmita");
        name[2]=("Zakir");
        name[3]=("isa");
        name[4]=("ddd");
        List<String> list= Arrays.asList(name);
        System.out.println(list);
        List<String> list2= new ArrayList<String>();


        for (String w : list
             ) {
            String l="";
           l= w.toUpperCase();
            System.out.println(l);
        }
        System.out.println("0000000000000000000000000");

        List<String> stringUpperCase= new ArrayList<String>();



    }

    public  static void ang(Integer [] a, Integer [] b, Integer [] c, Integer [] d){



    }
}
