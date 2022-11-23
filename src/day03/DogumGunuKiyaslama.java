package day03;

import java.util.Scanner;

public class DogumGunuKiyaslama {

/*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.

    2010/05/23

     */
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen Yil / Ay / Gun olarak karsilastirmak " +
            "istediginiz ilk dogum gununu giriniz "); //Ahmet

    int yil1 = scan.nextInt();
    int ay1 = scan.nextInt();
    int gun1 = scan.nextInt();
    System.out.println("Lutfen Yil / Ay / Gun olarak karsilastirmak " +
            "istediginiz ikinci dogum gununu giriniz "); //Ayşe

    int yil2 = scan.nextInt();
    int ay2 = scan.nextInt();
    int gun2 = scan.nextInt();

    if (yil1 > yil2) {
        System.out.println("Ayse, Ahmet'ten buyuktur.");
    } else if (yil1 < yil2) {
        System.out.println("Ahmet Ayse'den buyuktur.");
        // Bu satıra gelindiginde yıllar esittir, bu durumda aylara bakmak için yeni if blogu olusturulur.
    } else {
        if (ay1 > ay2) {
            System.out.println("Ayse, Ahmet'ten buyuktur.");
        } else if (ay1 < ay2) {
            System.out.println("Ahmet Ayse'den buyuktur.");
            // Bu satıra gelindiginde aylar esittir, bu durumda günlere bakmak için yeni if blogu olusturulur.
        } else {
            if (gun1 >gun2) {
                System.out.println("Ayse, Ahmet'ten buyuktur.");
            } else if (gun1 < gun2) {
                System.out.println("Ahmet Ayse'den buyuktur.");
                // Bu satıra gelindiginde aylar esittir, bu durumda günlere bakmak için yeni if blogu olusturulur.
            }else{
                System.out.println("Ayni gun dogdunuz.");
            }
        }
    }
    //************************2. Çözüm*******************************
    int ahmetDogumGunu=yil1*10000+ay1*100+gun1;  //20101110

    int ayseDogumGunu=yil2*10000+ay2*100+gun2;   // 20101010


    if(ahmetDogumGunu>ayseDogumGunu) {
        System.out.println("Ayse daha buyuktur");
    }else if(ahmetDogumGunu<ayseDogumGunu){
        System.out.println("Ahmet daha buyuktur");
    }else{
            System.out.println("Ayni gun dogdunuz.");
        }

 }
}
