package d30JavaPractice;
public class C06_MethodCreationRunner {
    public static void main(String[] args) {
        C06_MethodCreation obj1=new C06_MethodCreation();

        int a = 10;
        int b = 5;
        int c = 2;
       int sum= obj1.sum(a, b, c);
       int average= obj1.average2(10,b,2);
       int difference= obj1.difference(a,b,c);
       int multiply= obj1.multiply(a,b,c);
        System.out.println(sum+" "+average+" "+difference+" "+multiply);


    }
}
