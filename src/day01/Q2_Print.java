package day01;

public class Q2_Print {
    /*
    76453 sayisinin her bir basamagini konsolda alk alta yazdirin.

    input: 76453
    output: 7
            6
            4
            5
            3
     */
    public static void main(String[] args) {

        int sayi=85725;
        int birlerbasamagi=sayi%10;
        int onlarbasamagi=(sayi/10)%10;
        int yuzlerbasamagi=(sayi/100)%10;
        int binlerbasamagi=(sayi/1000)%10;
        int onbinlerbasamagi=(sayi/10000)%10;
        System.out.println(onbinlerbasamagi+"\n"+
                binlerbasamagi+ "\n"+yuzlerbasamagi+"\n"+onlarbasamagi+"\n"+birlerbasamagi );





    }
}
