package SchoolProject;

import java.util.Scanner;

public class Depo {
   static Scanner scan= new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("=======================YILDIZ KOLEJI===========================\n" +
                    "=============================ANA MENU==================\n" +
                    "\t     1- okul Bilgileri Görüntüle\n" +
                    "\t     2- ogretmen Menu\n" +
                    "\t     3- Ogrenci Menu\n" +
                    "\t     Q  - ÇIKIŞ ");
            System.out.println("lütfen menuden tercih yapınız");
            tercih=scan.nextLine();

            switch (tercih){
                case "1": //okul bilgilerei
                    Depo.okulBilgileriniYazdir();
                    break;
                    case "2": // Ogretmen Menu
                        Ogretmen.ogretmenMenu();
                        break;
                        case "3": //ogrenci Menu
                            break;
                case "q"://
                case "Q"://
                    break;
                default:
                    System.out.println("lutfen geçerli bir karakter giriniz");


            }

        }while(!tercih.equalsIgnoreCase("q"));

        projeDurdur();
    }
    public  static  void projeDurdur(){
        System.out.println("Okul projemizden çıktınız");
    }
    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("================YILDIZ KOLEJI====================\n" +
                "adres = "+Okul.adre+ "\n" +
                "telefon numarası = "+Okul.telefon);

        Thread.sleep(5000);
    }
}
