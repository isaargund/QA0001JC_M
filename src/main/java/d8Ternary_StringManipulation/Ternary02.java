package d8Ternary_StringManipulation;

public class Ternary02 {
    public static void main(String[] args) {

        //Example; if two numbers have the same sign, then return multiplication of them
        //if signs are different, print"i can not multiply the number

        int a =-4;
        int b =-5;

        Object result=((a<0&&b<0)||(a>b&&b>0))?(a*b):("ı can not multiply the number with different sign");
        System.out.println(result);//false part will work

        //object like adam for mankind. it is above all  the data types and covers all of them
        //ıt is uses memory more, but sometimes we can use it to consider possible results in different
        //data types.

    }

}
