package homeWork.Vehicle;

public class Strinbbb {
    public static void main(String[] args) {
        //        Write a code that takes a sentence and reverses the order of the words in the sentence by using StringBuilder.
//       your code should maintain the spaces between words. If the input sentence is empty, print "The sentence is empty".


        String sentence = "Java is a versatile programming language";
        StringBuilder stringBuilder = new StringBuilder(sentence);
        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());


        String[] reversed=sentence.split(" ");
        String result="";
        if (sentence.isEmpty()){
            System.out.println("The sentence is empty");
        }else{
            for (int i= reversed.length-1; i>-1;i--){
                result=result+" "+reversed[i];

            }

        }

        System.out.println(result);










    }
}
