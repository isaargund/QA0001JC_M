package d8Ternary_StringManipulation;

public class Ternary03 {
    public static void main(String[] args) {

        /*
        Example Check the given numbers if it is 3 digits number or not
         */
        int a =-167;
        a=Math.abs(a);

        String num=(a<1000&&a>99)?("three digits") :("not three digits");
        System.out.println("num = " + num);
    }
}
