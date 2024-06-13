package homeWork;

public class C10_StringBuilder {

    /*
    - Create a StringBuilder object with a capacity of 7.
    - Print the Capacity and Length values.
    - Append the string "hava güzel" to this object and print it.
    - Remove the space in the middle.
    - Reverse the data.
    - Delete the last 4 characters of the data.
    - Reverse the data again.
    - Append the string "Java " to the data.
*/
    public static void main(String[] args) {
        StringBuilder strbl=new StringBuilder(7);
        System.out.println("capacity : "+strbl.capacity()+" length : "+strbl.length());//capacity : 7 length : 0
        strbl.append("hava güzel");
        System.out.println("strbl = " + strbl);//strbl = hava güzel
       int indx= strbl.indexOf(" ");
       strbl.deleteCharAt(indx);
        System.out.println("strbl = " + strbl);
        strbl.reverse();
        System.out.println(strbl);
        strbl.delete(strbl.length()-4, strbl.length());
        System.out.println(strbl);
        strbl.append("java");
        System.out.println(strbl);
        strbl.insert(0,"baba ");
        System.out.println(strbl);
       // strbl

    }


}