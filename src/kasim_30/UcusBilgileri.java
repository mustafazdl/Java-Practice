package kasim_30;

import java.util.Scanner;

public class UcusBilgileri {
    /*
      1-) Kullanicinin ucak bileti almasi icin once kullanicinin bir hesabi var mi yok mu kontrol ediniz
      2-) Kullaniciya tek yon mu gidis donus mu bilet almak istediginiz sorun
      3-) Kullanicinin kaydi varsa kalkis yerini, gidicegi yeri kalkis saatini ve tarihini ogrenin.
          Ve bilet fiyatini kullaniciya gosterin
      4-) Eğer bilet fiyati kisiye uygun gelmediyse vazgecme opsiyonu ekleyin
    */
    Scanner scan = new Scanner(System.in);
    int seferSayisi=1000;
    public void ucusKontrol(){
        System.out.println("Yapmak istediginiz yolculuk seklini seciniz: Tek yon icin 1, gidis donus icin 2'ye basiniz.");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                tekYon();
                break;
            }
            case 2:{}
            default:{
                System.out.println("Yanlis deger girdiniz!");
                ucusKontrol();
            }





        }

    }

    int fiyatHesapla(){
        return (int)(Math.random()*100);
    }

    private void tekYon() {
        System.out.println("Kalkis noktasini giriniz: ");
        String kalkis=scan.nextLine();
        System.out.println("Inis noktasini giriniz: ");
        String inis=scan.nextLine();
        System.out.println("Ucus tarihini giriniz: (yyyy/mm/dd");
        String tarih=scan.nextLine();
        char kalkisIlkHarf=kalkis.charAt(0);
        char inisIlkHarf=inis.charAt(0);
        seferSayisi++;
        String ucusBilgileri=kalkis + "====>" + inis + " " + tarih + kalkisIlkHarf+inisIlkHarf+seferSayisi+
                            " Nolu ucusun fiyati $ "+fiyatHesapla() + " bilet fiyatiniz";
        System.out.println(ucusBilgileri + "Onaylıyor musunuz?E/H");
        char secim=scan.next().toUpperCase().charAt(0);
        if (secim=='E'){
            System.out.println("Biletiniz onaylanmistir"+ucusBilgileri);
        }else {
            System.out.println("Tesekkurler. Iyi gunler.");
        }

    }
}
