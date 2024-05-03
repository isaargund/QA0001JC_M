package d9StringManipulation;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example: in the following string, replace "money" with "dollars

        String str = "Learn java earn 3456 money";
        String newStr=str.replace("money","dollars");
        System.out.println("str = " + str);
        System.out.println("newStr = " + newStr);

        String str2 = "Learn java earn 3456 money";
        //Example 2; Remove all the characters of "e" from the string above....
        str2=str2.replaceAll("e","");
        System.out.println("str2 = " + str2);



    }
}
