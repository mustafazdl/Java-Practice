package day02;

import java.util.Scanner;

public class Q2_Scanner_IfStatement {
    /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
    // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u
    //Geçme notu:70  ; 60-70 arası şartlı geçiş
    //60 altı kalsın.

    public static void main(String[] args) {
        double vize,finalNotu,devam;
        Scanner scan =new Scanner(System.in);
        System.out.print("Vize notunu giriniz: ");
        vize= scan.nextDouble();
        System.out.print("Final notunu giriniz: ");
        finalNotu= scan.nextDouble();
        System.out.print("Devam puanini giriniz: ");
        devam= scan.nextDouble();

        double ortalama=(vize*0.1)+(finalNotu*0.8)+(devam*0.1);


        if (finalNotu>100||finalNotu<0||vize>100||vize<0||devam>100||devam<0){
            System.out.println("Yanlis giris yaptiniz, lütfen gecerli degerler giriniz!!!");

        }else if(ortalama>=70){
            System.out.println("Tebrikler, "+ortalama+" puan ile dersi geçtiniz.");
        }else if(ortalama>=60){
            System.out.println(ortalama+" puan ile dersi şartli geçtiniz.");
        }else{
            System.out.println(ortalama+" puan ile maalesef dersten kaldiniz");
        }





    }
}
