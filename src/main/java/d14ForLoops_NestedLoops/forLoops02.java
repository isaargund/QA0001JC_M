package d14ForLoops_NestedLoops;

public class forLoops02 {
    public static void main(String[] args) {
        // in the given string , print the string except lowercases in it
        /*
        String s1="Pwd12?Ab";//P12?A excepted
         s1 = s1.replaceAll("[a-z]" , "");
        for (int i=0;i<s1.length();i++){


            System.out.print(s1.charAt(i));

        } */

        //Example; in the given string, print the string except lowercases in it.....
        // Pwd12?Ab => P12?A
        //continue keyword is used to skip a data when condition is met....


        String s1 = "Pwd12?Ab";

        //1)Create a for loop to get characters from the given string....
        for (int i=0; i<s1.length(); i++){

            //2) I need to take single characters from the given string so create a container by using char data type....

            char ch = s1.charAt(i);


            //3) i need to create a condition to ignore/skip the lowercases....
            if (ch >= 'a'&& ch <= 'z'){

                continue;
            }

            System.out.print(ch);

        }

    }
}
