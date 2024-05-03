package exercises;

public class ex6 {
    public static void main(String[] args) {
        /*
        create 2 words : name1 and name2
if the name1 has even numbers of characters,
then insert the second word in the middle of the first name
if the first word has odd numbers
Then print the “Name2 cannot be inserted in the name1”
e.g:
name1= mehmet
name2= ahmet
Print ==> mehahmetmet
         */

        String name1 ="mehmet";
        String name2 ="ahmet";

        int nameControl=name1.length()%2;
        if(nameControl==0) {

            String firtHalf = name1.substring(0, name1.length()/2);
            String secondHalf=name1.substring(name1.length()/2);
            System.out.println(firtHalf+name2+secondHalf);

        }else {
            System.out.println("Name2 cannot be inserted in the name1");

        }
        String name = (name1.length() % 2 == 0) ? (name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2)) :
                ("Name2 cannot be inserted in the name1");
        System.out.println(name);

    }
}
