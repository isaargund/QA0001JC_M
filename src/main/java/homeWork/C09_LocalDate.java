package homeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C09_LocalDate {

    public static void main(String[] args) {

        /*
    - Ali was born 45 years, 8 months, and 5 days after 29.10.1923.
    - Veli was born 24 years, 2 months, and 11 days before 15.09.1993.
    - Calculate and print the birth dates of Ali and Veli.
    - Print Ali's birth date in the format DD/MM/YY.
    - Write a code to check if Ali and Veli's birth dates are the same.

*/
        Date  bourn=new Date();

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate alisBirthDay=date1.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("Ali bourn in: "+alisBirthDay);
        LocalDate baseDate=LocalDate.of(1993,9,15);
        LocalDate veliBirthDay=baseDate.minusYears(24).minusMonths(2)
                .minusDays(11);
        System.out.println("Veli's Birthday : "+veliBirthDay);
     DateTimeFormatter newDate= DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(  "Ali's birthday : " +alisBirthDay.format(newDate));

        if (alisBirthDay.isEqual(veliBirthDay)){
            System.out.println("Birth days are same");
        }else{
            System.out.println("birthdays are different");
        }






    }
}

