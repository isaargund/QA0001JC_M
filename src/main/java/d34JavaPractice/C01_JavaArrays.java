package d34JavaPractice;

public class C01_JavaArrays {//    Count how many words start with 'a' or 'A' in a given String

    public static void main(String[] args) {


        String s = "Apex is an object oriented programming language";
        String[] words = s.split(" ");
        int count=0;
        for (String w:words
             ) {
            if (w.startsWith("a")||w.startsWith("A"))  count++;
        }
        System.out.println(count);
    }

}
