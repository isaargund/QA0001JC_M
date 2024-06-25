package homeWork;

public class bab {
    public static void main(String[] args) {
        // Finding the longest word(s) in a given string and printing their length, and print the longest word on the console....
        String s = "Java is a versatile and powerful programming language. Thats why we need to finish java homeworks";
        String[] longestwords = s.split(" ");

        String answer ="";

        for (String w : longestwords
        ) {
            if (w.length()>answer.length()) {
                answer=w;

            }

        }

        System.out.println(answer+" : "+answer.length());

    }
}
