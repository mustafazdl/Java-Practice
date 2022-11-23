package day03;

import java.util.Scanner;

public class HesapMakinesi2 {

    /*
Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup
 sonucunu yazdiriniz
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz : " +
                "\n\t-Toplama için +\n\t2. Çıkarma için -\n\t3. Çarpma için *\n\t4. Bölme için /");

        char islem=scan.next().charAt(0);

        System.out.println(calculator(islem, sayi1, sayi2));


    }

   public static double calculator(char islemTipi, double num1,double num2){
        double sonuc=0;
        switch (islemTipi){
            case '+':
                sonuc=num1 + num2;
                break;
            case '-':
                sonuc=num1 - num2;
                break;
            case '*':
                sonuc=num1 * num2;
                break;
            case '/':
                sonuc=bolme(num1,num2);
                break;
        }
    return sonuc;
   }

    private static double bolme(double bolunen, double bolen) {

        if(bolen==0 && !(bolunen==0))
            return Double.POSITIVE_INFINITY; //pozitif sonsuzluk

        else if(bolen==0 && bolunen==0)
            return Double.NaN;

        else return bolunen/bolen;


    }


}
