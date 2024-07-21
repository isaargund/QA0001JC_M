package SchoolProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    private static String isim="isim verilmedi";
    private static String soyIsim="soyisim verilmedi";
    private static String kimlikNo="KimlikNo verilmedi";
    private static String dogumYili="dogumYili verilmedi";
    private static String Branş="Branş verilmedi";

    static Scanner scan=new Scanner(System.in);

    static Map<String,String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenlerEkle(){
        ogretmenlerMap.put("1","ali, sunal, 1980");
        ogretmenlerMap.put("2","veli, cemal, 1981");
        ogretmenlerMap.put("3","cemal, sureyya, 1900");
        ogretmenlerMap.put("4","ali, sunal, 1980");
    }


    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do {


            System.out.println("=======================YILDIZ KOLEJI===========================\n" +
                    "=============================ANA MENU==================\n" +
                    "\t     1- Ogretmenler Listesi yazdır\n" +
                    "\t     2- Soy isimden ogretmen bulma\n" +
                    "\t     3- branştan öğretmen bulma\n" +
                    "\t     4- bilgileri girerek ogretmen ekleme\n" +
                    "\t     3- kimlik no ile kayıt silme\n" +
                    "\t     A  - ANAMENU "+
                    "\t     Q  - ÇIKIŞ ");
            System.out.println("lütfen menuden tercih yapınız");
            tercih=scan.nextLine();

            switch (tercih){
                case "1":
                    Ogretmen.ogretmenListesiYazdir();
                    break;

                case "2":
                    break;


                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "A":
                    Depo.anaMenu();
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                    break;
                case "q":
                    break;

                default:
                    System.out.println("lütfen geçerli bir karakter giriniz");
            }

        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void ogretmenListesiYazdir() {
       Set<Map.Entry<String,String>> ogretmenEntrySet= ogretmenlerMap.entrySet();

    }
}
