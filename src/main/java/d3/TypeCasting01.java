package d3;

public class TypeCasting01 {
    public static void main(String[] args) {
        //if you assign a primitive data type to another primitive data type it called casting
        //to put small data types into large data types is easy and java do it automatically.

        byte myAge=34;
        int age=myAge;

        //to put large data type in to a small data type has risk and java does not do it automatically.
        //you have to type small data typein front of large data type
        //the name of this process is explicit Narrowing
        long value1=3400;
        short value2= (short) value1;

        int numOfStudents=12;
        float moneyAmount=500.0f;
        System.out.println(moneyAmount/numOfStudents);//41.666668



    }
}
