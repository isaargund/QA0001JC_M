package exercises;

public class ex9 {
    public static void main(String[] args) {

        String s = "John came late";
        int a=0;
        for (int i = s.length() - 1; i > -1; i--) {
            char c = s.charAt(i);

            if (s.indexOf(c) != (s.lastIndexOf(c))) {
                if(s.indexOf(c)!=' '){
                    a++;
                    System.out.println(c+" : "+a);

                }


            }
        }
    }}