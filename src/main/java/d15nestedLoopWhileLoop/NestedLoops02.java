package d15nestedLoopWhileLoop;

public class NestedLoops02 {
    public static void main(String[] args) {
        for (int i =1;i<5;i++){


            for (int j=1;j<5;j++){

                System.out.print("*");
                if (j==i){
                    break;
                }
            }
            System.out.println("");
        }
    }
}
