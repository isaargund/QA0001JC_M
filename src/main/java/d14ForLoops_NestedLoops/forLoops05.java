package d14ForLoops_NestedLoops;

public class forLoops05 {
    public static void main(String[] args) {
        int total=0;

        for (int i = 5; i <10;i++){
            total=total+i;
        }

        System.out.println(total);


        //Example 2 calculate the multiplication of the numbers from 10 to 7
        int sum=1;
        for (int i=7;i<11;i++){
            sum=sum*i;
        }
        System.out.println("sum = " + sum);
    }
}
