package d35_IteratorAndLambda;

import java.util.Scanner;

public class EnamRunner {
    public static void main(String[] args) {
        //1) Reach out to constant in enum
        Cities c=Cities.İSTANBUL;
        System.out.println(c);//İSTANBUL

        //2) Reach out to the CityName of Constant data....

        String city=Cities.BURSA.getCityname();
        System.out.println(city.toLowerCase());//bursa

        int pcode=Cities.ADANA.getPlateCode();
        System.out.println(pcode);//1

        String postalcode=Cities.ANKARA.getPostalcode();
        System.out.println(postalcode);//06000


        //Ask user to enter plate code of city, and print city name on the console....
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a plate code");
        Cities []cityInTurkey=Cities.values();

        int plate=scan.nextInt();

      if (plate<1||plate>81){
          System.out.println("invalid plate number");
      }else {
          for (Cities w:cityInTurkey
               ) {

              if (w.getPlateCode()==plate){
                  System.out.println(w.getCityname());//w.getCityname()
              }
          }
      }



    }
}
