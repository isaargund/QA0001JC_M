package homeWork;

import java.util.Scanner;

public class gg {
    public static void main(String[] args) {
        //        get a word from user.
//        The loop should continue Until the character 'c' is encountered in the word.
//        Count the number of 'a' characters in the word up to that point.
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.nextLine();
        String[] split = word.split("");
        int countA=0;
        for (int i=0; i<split.length; i++) {
            if (split[i].equalsIgnoreCase("a")){
                countA++;
            }
            if(split[i].equalsIgnoreCase("c")){
                break;
            }

        }
        System.out.println("countA: " + countA);

    }
}
