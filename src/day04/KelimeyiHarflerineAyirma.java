package day04;

import java.util.Arrays;

public class KelimeyiHarflerineAyirma {

/*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */
public static void main(String[] args) {

String name="Mustafa";
charArraykelimeninharfleri(name);   //Kelimenin harfleri array'i : [M, u, s, t, a, f, a]
charArraykelimeninharfleri("String"); //Kelimenin harfleri array'i : [S, t, r, i, n, g]

}
public static void charArraykelimeninharfleri(String input){

    char[] output=new char[input.length()];

    for (int i = 0; i <input.length() ; i++) {
      output[i]=input.charAt(i);

    }
    System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));
}

}
