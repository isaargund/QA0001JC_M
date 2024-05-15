package d017Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example; Create an array with 6 elements and print the number less than 5 on the console.....

// 1, -3,-5,6, 7,5 ===> 1,3,5
        int [] a = new int[6];
        a[0] =1;
        a[1] =-3;
        a[2] =-5;
        a[3] =6;
        a[4] =7;
        a[5] =5;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<5){
                System.out.print(a[i]);

            }
        }
        /*
         //2nd way to create an array for each

        int [] numbers = {1,-3,-5,6,7,5};

        for(int i : numbers){

            if (i<5){

                System.out.println(i);
            }
         */

    }
}
