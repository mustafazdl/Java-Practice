package kasim_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soru2 {

    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
   // 100 girildiğinde veri girişi sonlandırılsın.
  // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Double> gununSicakliklari = new ArrayList<>();


        int sonlandirmaDegeri=100;

        double girilenSicaklik=0;
        int sayac=0;

        do {
            System.out.println("Listeye eklemek icin bir sicaklik degeri giriniz" +
                    "\nSicaklik girisini sonladirmak icin 100 degeri giriniz.");

            girilenSicaklik=scan.nextDouble();

            if(girilenSicaklik !=sonlandirmaDegeri){
                gununSicakliklari.add(girilenSicaklik);
                sayac++;
            }

        }while (girilenSicaklik!=sonlandirmaDegeri);
        {

            System.out.println("Veri girisi sonlandirildi.");
        }
        Collections.sort(gununSicakliklari);

        System.out.println("Gunun en dusuk sicakligi :" + gununSicakliklari.get(0));
        System.out.println("Gunun en yuksek sicakligi :" + gununSicakliklari.get(sayac-1));

    }

}
