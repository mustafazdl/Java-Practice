package day01;

public class Q1_Print {

    /*
    "Hello "\ / 'World'"
    yazdırınız.


      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.

     */
    public static void main(String[] args) {
        System.out.println("\"Hello \"\\ / 'World\'\"");  //"Hello "\ / 'World'"
        System.out.print("\"Hello \"\\ / 'World\'\"");  //"Hello "\ / 'World'"
        System.out.println("dsds g\tdg"); //dsds g	dg
        System.out.println('\''); //'

        System.out.println(3+7);          //10 matematiksel toplam
        System.out.println("ali"+"ayse"); //aliayse   concatination



        /*
        *********************************
                "ATM'ye Hoşgeldiniz"

           1- Bakiye Sorgulama
           2- Para Yatirma
           3- Para Çekme
           4- Menu'den Çikis

        * ************************************
         */

        System.out.println("*************************************\n\t\t\"ATM'ye Hoşgeldiniz\"" +
                "\n\n\t1- Bakiye Sorgulama\n\t2- Para Yatirma\n\t3- Para Çekme\n\t4- Menu'den Çikis" +
                "\n\n************************************");





    }
}
