package exercises.bb;

public class uniqCharacters {
    public static void main(String[] args) {
        String str="boobbalanced";
        String uniqCharacters  =    "" ;


        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
              if (str.indexOf(ch)==str.lastIndexOf(ch)) {
                  uniqCharacters=uniqCharacters+ch;
              }



        }
        System.out.println("uniqCharacters = " + uniqCharacters);
        
        
        String str2="bootcamp";
        String rslt="";
        for (int i=0;i<str2.length();i++) {
            char ch=str2.charAt(i);
            if (str2.indexOf(ch)==str2.lastIndexOf(ch)) {
                rslt=rslt+ch;
                
            }
        }
        System.out.println("rslt = " + rslt);
    }
}
