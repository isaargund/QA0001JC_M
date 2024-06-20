package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ddd000 {
    public static void main(String[] args) {
        //        Decrease the value of every element that is greater than 20 by 5 in a list. If the element is 20 or less,
//        multiply it by 2.

//        [20, 30, 25, 20, 40]
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(20, 30, 25, 20, 40));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >20){
                nums.set(i, nums.get(i)-5);
            }
            if (nums.get(i) <=20){
                nums.set(i, nums.get(i)*2);
            }


        }
        System.out.println(nums);
    }
}
