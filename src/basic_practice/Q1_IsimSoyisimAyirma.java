package basic_practice;

import java.util.Scanner;

public class Q1_IsimSoyisimAyirma {
    /*
    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
// ad ayrı soyad ayrı sekilde ekrana yazdırınız.

input: "AHMET YILMAZ";
Output: Ahmet
        Yilmaz

*/
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);  //scan ifadesi yerine başka bir ifade de kullanabiliriz.

        System.out.println("Lütfen isim ve soyisminizi giriniz: ");

        String adSoyad =scan.nextLine();

        String ad= adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("ad = " + ad + "\nsoyad = " + soyad);



         //subString metodu üzerinde işlem yapilan stringin istenen bir parçasını size geri döndürür.
        //Bunu yaparken size 2 farklı olanak sunar:
        //1. Tek int parametre ister ve belirtilen indeksten string sonuna kadar size geri döndürür
        //2. 2 tane int parametreister, ilk int parametre başlangıc indeksine isaret eder
        // ve o index'i de dahil ederek verilen 2. index'e kadar olan springi size döndürür,
        // 2.index'teki katakter dahil değildir.







    }

}
