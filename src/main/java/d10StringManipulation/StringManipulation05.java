package d10StringManipulation;

public class StringManipulation05 {
    public static void main(String[] args) {

        //Example Catch first 4 characters in the given String

        //Substring(starting index) ===. returns part of the string by starting from specied index and to the end of string

        //substring (starting index , ending index) ==> returns part of string that begins with the character
        //specified in first parameter and extends to the character at ending index

        //NOTE: (starting index) first parameter is inclusuive
//        (ending index) second parameter is exclusive

        String s="Java is funny";
        System.out.println("s.substring(0,4) = " + s.substring(0,4));
        System.out.println("s = " + s.substring(0,s.length()));
        System.out.println("s= " + s.substring(0));
        //all of them same thing
        // i wanna see "funny" on the console
        System.out.println("s.substring(8) = " + s.substring(8));
        
    }
}
