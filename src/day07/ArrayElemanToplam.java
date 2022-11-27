package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanToplam {

    public static void main(String[] args) {

         // Kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        double [] num;
        double sum=0;
        int size;

        System.out.println("Kac adet sayi toplamak istiyorsunuz?");

        size=scan.nextInt();

        num=new double[size];

        for (int i = 0; i < size; i++) {

            System.out.print(i+1 + ". sayi giriniz : ");
            num[i]= scan.nextDouble();
            sum+=num[i];

        }
        System.out.println( "Sayilar Array'i = " + Arrays.toString(num) +
                            "\nSayilarin toplami = " + sum);
    }
}
