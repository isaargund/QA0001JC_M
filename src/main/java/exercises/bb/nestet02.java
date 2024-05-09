package exercises.bb;

public class nestet02 {
    public static void main(String[] args) {
        for (int i=1; i<3;i++) {
            System.out.println("    week"+i+" :");
            for (int j=1; j<4; j++) {
                System.out.println("        day "+j+" :");
            }

        }
        for (int i=1; i<5; i++) {
            for (int j=1; j<5; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
