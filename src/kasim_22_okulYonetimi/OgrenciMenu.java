package kasim_22_okulYonetimi;
/*
============= İŞLEMLER =============
 1-EKLEME
 2-ARAMA
 3-LİSTELEME
 4-SİLME
 Q-ÇIKIŞ
SEÇİMİNİZ:
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMenu implements IIslemler {

    ArrayList<Ogrenci> ogrencilist=new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    void ogrMenu() {
        System.out.print("============= İŞLEMLER =============\n" +
                "1-EKLEME\n" +
                "2-ARAMA\n" +
                "3-LİSTELEME\n" +
                "4-SİLME\n" +
                "Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ:");


        while (true) {
            char secim = scan.next().toUpperCase().charAt(0);
            switch (secim) {
                case '1': {
                    ekleme();
                }
                case '2': {
                    arama();
                }
                case '3': {
                    listeleme();
                }
                case '4': {
                    silme();
                }
                case 'Q': {
                    cikis();
                }


            }
        }
    }

            @Override
            public void ekleme () {
                System.out.println("İsim giriniz: ");
                String isim =scan.nextLine();
                System.out.println("Soyisim giriniz: ");
                String soyIsim =scan.nextLine();
                System.out.println("Tc No giriniz: ");
                String tcNo =scan.next();
                System.out.println("Yas giriniz: ");
                int yas =scan.nextInt();
                System.out.println("Sinif giriniz: ");
                String sinif =scan.next();
                System.out.println("Ogrenci No giriniz: ");
                int ogrNo =scan.nextInt();
                Ogrenci ogrenci=new Ogrenci(isim,soyIsim,tcNo,yas,sinif,ogrNo);
                ogrencilist.add(ogrenci);
                ogrMenu();

            }

            @Override
            public void arama () {
        if (!ogrencilist.isEmpty()){
            System.out.print("Arama yapilacak Tc no giriniz: ");
            String aranacakTc=scan.next();
            for (Ogrenci each:ogrencilist) {
                if(each.getTcNo().equals(aranacakTc)){
                    System.out.println(each.toString());
                }else {
                    System.out.println(aranacakTc + "Tc no ya ait bilgi bulunamadı. ");
                    ogrMenu();
                }

            }
            ogrMenu();
        }else{
            System.out.println("Ogrenci listesi bos");
            ogrMenu();
        }

            }

            @Override
            public void listeleme () {
            if(!ogrencilist.isEmpty()){
                for (Ogrenci each:ogrencilist) {
                    System.out.println(each.toString());
                }
                ogrMenu();
            }else {
                System.out.println("Ogrenci listesi bos");
                ogrMenu();
            }
       }

            @Override
            public void silme () {
                if (!ogrencilist.isEmpty()){
                    System.out.print("Silme yapilacak Tc no giriniz: ");
                    String aranacakTc=scan.next();
                    for (int i = 0; i <ogrencilist.size() ; i++) {
                        if(aranacakTc.equals(ogrencilist.get(i).getTcNo())){
                            ogrencilist.remove(i);
                            ogrMenu();
                        }
                    }
                    ogrMenu();
                }else{
                    System.out.println("Ogrenci listesi bos");
                    ogrMenu();
                }

            }

            @Override
            public void cikis () {
                AnaMenu anaMenu=new AnaMenu();
                anaMenu.anaMenu();
            }
        }


