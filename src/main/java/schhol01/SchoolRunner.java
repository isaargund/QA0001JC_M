package schhol01;

public class SchoolRunner {
    public static void main(String[] args) {
        Teacher01 teacher001=new Teacher01("isa","argundogan","history");
        System.out.println("teacher001.surname = " + teacher001.surname);
        Teacher01 teacher002=new Teacher01("nasreddin","dağ","sosyalbilgiler");
        System.out.println("teacher002 = " + teacher002);
    }
}
