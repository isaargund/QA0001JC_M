package exercises;

public class ex8 {
    public static void main(String[] args) {
        String str = "hi";

        for (int i = 0; i < 5; i++) {
            System.out.println("str = " + str);

            //print the numbers




        }
        for (int i = 20; i >= 8; i--) {

            System.out.print(  i+", ");
        }
        System.out.println("**************************************");
        for (int i =3; i<=10; i++) {
            if (i%2 == 0) {
                System.out.println("i = " + i);
            }
        }
        for (int i =21; i > 8; i-=2) {
            System.out.println(i);

        }
       //Example; in the given string, print all the characters before "m" on the console

        String s = "Miami";
        int m=s.indexOf("m");

        for (int i=0;i<m;i++){
            System.out.print(s.charAt(i));

        }
//Mia
    }
}