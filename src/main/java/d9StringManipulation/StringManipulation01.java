package d9StringManipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        //String data type: is used to store words, sentences, symbols etc....

        // Example; Check the given string and calculate total number of characters in string.....

        String s = "Java is so easy!";

        //length() ==> this method calculates number of characters including spaces in string.......

        int numberOfChars = s.length();


        System.out.println("numberOfChars = " + numberOfChars);
        //if you wanna see a single character in the string value, we can use charAt() method
        //charAt() method using index number of String characters.
        
        char firstChar = s.charAt(0);
        System.out.println("firstChar = " + firstChar);
        char lastChar = s.charAt(s.length() - 1);//for finding last character
        System.out.println("lastChar = " + lastChar);

        String message="Good Morning Dear Friends";
        //calculate number of characters and find first and the last characher
        int numberOfCharacters=message.length();
        char first=message.charAt(0);
        char last=message.charAt(message.length()-1);
        System.out.println("first character : "+first+" last character : "+last+" total character : "+numberOfCharacters);

        //String variables, all the characters locating in an index number..... start from 0(zero).....
        //Index is zero-based characteristic
        //First character is in index 0 everytime
        //And the index number increase from left to right one by one......
        //if you wanna see the single character in the string value, we can use "charAt()" method
        // charAt() method is working by using index number of string value....



    }
}
