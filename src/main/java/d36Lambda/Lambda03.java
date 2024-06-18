package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,3,4,5,10,10));
        as(nums);//27 27 125
        removeDublicate(nums);


// create a method to calculate cube of odd numbers in the list......

    }
    public  static  void as(List<Integer> nums) {
        nums.stream().filter(t ->t%2!=0).map(t -> t*t*t).forEach(t -> System.out.print(t+" "));
    }
    //remove dublicate elements in the list
    public static void removeDublicate(List<Integer> nums) {
        System.out.println("");
        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t -> System.out.print(t+" "));
    }
}
