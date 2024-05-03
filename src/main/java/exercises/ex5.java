package exercises;

public class ex5 {
    public static void main(String[] args) {
      //Example2 ; Convert all digits into "*" in a card number except last digits.....
// 1234 6789 1234 6789 ====> 1234 6789 1234 ****

        String cardNum = "1234 6789 1234 6789";
        String lastNum=cardNum.substring(cardNum.length()-4);
        System.out.println(lastNum);
        cardNum=cardNum.replaceAll("\\d", "*");
        cardNum=cardNum.substring(0, cardNum.length()-4)+lastNum;
        System.out.println(cardNum);


    }
}
