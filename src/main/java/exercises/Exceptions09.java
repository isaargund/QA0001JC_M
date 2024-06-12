package exercises;

public class Exceptions09 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        int [] c={3,5,9,7};
    }

    public static void call(int []c,int a,int b){

       try {
           int idx=a/b;

        int element =c[idx];
        System.out.println(element);
    }catch(ArithmeticException e){
           System.err.println("the problem is "+e.getMessage());

       }catch (ArrayIndexOutOfBoundsException e){
           System.err.println("the problem is "+e.getMessage());
       }finally {
           System.out.println("Cut the connection with database");//multiple finally not allowed

       }
    }
}
