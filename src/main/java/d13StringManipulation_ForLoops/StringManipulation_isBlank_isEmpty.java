package d13StringManipulation_ForLoops;

public class StringManipulation_isBlank_isEmpty {
    public static void main(String[] args) {
        //Example: checkt the given password if it meets the following conditions

//it should not be empty
//it should not contain just space characters, there must be others as well
//it should not contain leading and ending spaces...

        String pwd = "   abc  ";
        boolean emptyIS=pwd.isEmpty()==false;
        System.out.println("emptyIS = " + emptyIS);
        boolean spaceControl=pwd.replaceAll("\\s","").isEmpty()==false;
        System.out.println("spaceControl = " + spaceControl);
        boolean firstCharacter=pwd.endsWith(" ")==false;
        System.out.println("firstCharacter = " + firstCharacter);
        boolean lastCharacter=pwd.endsWith(" ")==false;
        System.out.println("lastCharacter = " + lastCharacter);
        boolean third =pwd.trim().length()==pwd.length();//for changing
        System.out.println("third = " + third);
        boolean thirdd=(pwd.trim().equals(pwd));
        System.out.println("thirdd = " + thirdd);

        String pass="  ";

        boolean isBlank=pass.isBlank();//true because blank dosnt check space character
        boolean isEmpty=pass.isEmpty();//false because there is space in  "pass"


    }
}
