package d14ForLoops_NestedLoops;

public class forLoops3 {
    public static void main(String[] args) {
        /*
        String s2="java";
        for (int i=s2.length()-1; i>-1; i--) {
            System.out.print(s2.charAt(i));

        }

         */
        //Example7 Reverse the given string data
        // Java => avaJ    Hello => olleH Anna => annA (Pallindrome)
        String s2 = "Java";


        //1) Create a place to store reversed version.....

        String reversed = "";


        //2) i need to create a for loop structure to take the characters one by one

        for (int         i=s2.length()-1;                    i>=0;                                i--){


            //3) I need to take character and do concatination then put your character into the reversed container....

            reversed =reversed + s2.charAt(i);


        }

        //4) Print the reversed data

        System.out.println("reversed = " + reversed);


        if (s2.equals(reversed)){

            System.out.println("This is pallindrome");
        }
    }
}
