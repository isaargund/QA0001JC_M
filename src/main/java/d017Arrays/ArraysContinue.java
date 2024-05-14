package d017Arrays;

public class ArraysContinue {
    public static void main(String[] args) {
        int [] age = new int[5];
        age [0]=12;
        age [1]=45;
        age [2]=67;
        age [3]=27;
        age [4]=36;

        int young=0;
        int old =0;

        for (int i = 0; i < age.length; i++) {

            for (int j = 0; j < age.length;j++) {
                if (age[i]<age[j]) {
                    young=age[i];
                }

                if (age[i]>age[j]) {
                    old=age[i];
                }
            }
        }
        System.out.println(old+young);
        System.out.println(old);
        System.out.println(young);


    }
}
