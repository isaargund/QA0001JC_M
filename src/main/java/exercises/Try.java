package exercises;

import java.util.ArrayList;

public class Try {
    public static void main(String[] args) {

        //Create an Arraylist as Integer and change odd elements with 10.....
// 23 , 24, 12, 18,9
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(18);
        list.add(9);

        int length=list.size();
        for (int i=0; i<length; i++) {
            if(list.get(i)%2!=0){
                list.set(i,10);

            }
        }
        System.out.println(list);
}}
