package exercises;

public class Try {
    public static void main(String[] args) {
        int i=1;
        do {
            if (i==3){
                continue;
            }else if(i==5){
                System.out.println(i+" ");
                break;

            }else {
                System.out.println(i+" ");
            }
            i++;
        }while (true);

    }

}
