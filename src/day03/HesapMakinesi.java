package day03;

import java.util.Scanner;

public class HesapMakinesi {
    /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
 */

/*
        Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
/*Kullanicidan satin aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti
olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim
yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin"*/

    public static void main(String[] args) {

      /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup
    sonucunu yazdiriniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi giriniz: ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz : " +
                "\n\t1. Toplama\n\t2. Çıkarma\n\t3. Çarpma\n\t4. Bölme");

        int islem=scan.nextInt();

        //char islem2 =scan.next().charAt(0); ==> Kullaicidan char alma yolu

        if(islem==1){
            System.out.println("Girdiğiniz sayilarin toplami= " + (sayi1 + sayi2));
        }else if(islem==2){
            System.out.println("Girdiğiniz sayilarin farki= " + (sayi1 - sayi2));
        } else if(islem==3){
            System.out.println("Girdiğiniz sayilarin carpimi= " + (sayi1 * sayi2));
        }else if(islem==4) {
            System.out.println("Girdiğiniz sayilarin bölümü= " + (sayi1 / sayi2));
        }else{
            System.out.println("Hatli giris yaptiniz");
        }



    }




}


