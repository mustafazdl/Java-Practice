package day06;

import java.util.Arrays;

public class Q2_Arrays {
    public static void main(String[] args) {

        int [] integers;
        integers=new int[5];
        //System.out.println(integers); // referansi getirir. [I@6d03e736

        System.out.println(Arrays.toString(integers)); // [0, 0, 0, 0, 0]

        integers[0]=1;
        integers[1]=2;
        integers[2]=3;
        integers[3]=4;
        integers[4]=5;

        System.out.println(Arrays.toString(integers));

       char[] charlar =new char[3];
       charlar[0]='A';
       charlar[1]='B';
       charlar[2]='C';

       String charlarString=Arrays.toString(charlar);

        System.out.println(charlarString); // [A, B, C]

        String [] isimler = new String[3];

        isimler[0]="Ayse";
        isimler[1]="Fatma";
        isimler[2]="Hayriye";


        System.out.println(Arrays.toString(isimler));

        //Soru: Ayşe ile Fatma'nin yerini degistirelim:

        String bosKova=isimler[0];
        isimler[0]=isimler[1];
        isimler[1]=bosKova;

        System.out.println("Yeni Hali : " +  Arrays.toString(isimler));


    }
}
