package d30JavaPractice;

import java.util.ArrayList;

public class C04_ArrayList {
    public static void main(String[] args) {
        // Find the sum of all list elements before the first occurrence of 13 in an integer list
//{31,7,13,10}
        //{12,31,7,13,10}

        ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(12);
         list.add(31);
         list.add(7);
         list.add(13);
         list.add(10);
         Integer sum=0;

        for (int w:list
             ) {
            if (w==13){
                break;
            }
            sum+=w;
        }

        System.out.println(sum);

        int [] a={12,31,7,13,10};
        int sum2=0;
        for (int i=0;i<a.length;i++){

            if (a[i]!=13){
                sum2=sum2+a[i];

            }else break;
        }
        System.out.println(sum2);

    }
}
