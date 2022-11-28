package basic_practice;

import java.util.Scanner;

public class Q12_KarekokHesaplama {
    /*
    Kullanicidan alinan pozitif bir tam sayinin karekokunu alınız
    Not: Virgulden sonra 3 basmak gosterecek.

    ORN:  INPUT: 9  OUTPUT:3
          INPUT: 2  OUTPUT:1,414

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz: ");
        double sayi= scan.nextDouble();

        double karekok=1.0;

        for (double i = 1; i*i <=sayi ; i+=0.001) {
            karekok=i;

        }
        System.out.printf("%.3f",karekok);
    }
}
