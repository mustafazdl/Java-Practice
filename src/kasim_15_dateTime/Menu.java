package kasim_15_dateTime;

import java.util.Scanner;

public class Menu {
   static Registration registration=new Registration();
    static Listing listing = new Listing();
    static void giris() {
        System.out.println("Yapmak istediginiz islemi seciniz\n" +
                 "1. Isim girisi\n" +
                 "2. Sansli isimleri listeleme\n " +
                 "3. Cıkıs\n" +
                "Seciminiz: ");
        Scanner scan = new Scanner(System.in);

        while (true) {
           if (scan.hasNextInt()){
               int secim=scan.nextInt();
               switch (secim){
                   case 1: {
                       registration.register();
                   giris();
                   }
                   case 2: {
                       listing.listele(registration.usersList);
                       giris();
                   }
                   case 3: {
                       System.out.println("Gule gule");
                       System.exit(0);
                   }
                   default: {
                       System.out.println("Gecerli deger giriniz.");
                       giris();
                   }

               }

           }else {
               System.out.println("Gecerli deger giriniz");
               giris();

           }
        }
    }
}
