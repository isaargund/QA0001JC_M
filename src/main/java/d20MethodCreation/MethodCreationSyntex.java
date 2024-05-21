package d20MethodCreation;

public class MethodCreationSyntex {
    public static void main(String[] args) {
        //how to create a method in java
        //we can not create a method inside  another method
        //if inside a method(example maim method) an inner class(nested class) can be defined; but

        //Access Modifier+static(optional)+return type +methodName+(){method body}
        
        int result =addition(23,45,12);
        System.out.println("result = " + result);

    }//end of main method
    public  static int addition(int a,int b,int c){
        int totalValue =a+b+c;
        return totalValue;
    }
}
