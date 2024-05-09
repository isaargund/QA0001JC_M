package exercises.bb;

public class nestedLoops {
    public static void main(String[] args) {
        /*
        1234567890
        246810121416...
         */
        for (int i = 1; i <11; i++) {

            for (int j = 1; j <=10; j++) {

                System.out.print((i*j)+" ");

            }
            System.out.println("");
        }
    }
}
