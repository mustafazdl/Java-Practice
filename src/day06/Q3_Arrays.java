package day06;

public class Q3_Arrays {
    //Create an array of 5 floats and calculate their sum.

    public static void main(String[] args) {

        float [] sayilar = {1.0f,2.0f,3.0f,4.0f,5.0f};

        float toplam=0f;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("Toplam = " + toplam);

        System.out.println("***********************WHILE COZUMU 1*****************************");

        toplam=0;
        int index=sayilar.length-1;

        while (index>=0){
            toplam+=sayilar[index];
                    index--;
        }
        System.out.println("Toplam = " + toplam);

        System.out.println("***********************WHILE COZUMU 2*****************************");

        toplam=0;
        index=0;

        while (index< sayilar.length){
            toplam+=sayilar[index];
            index++;
        }
        System.out.println("Toplam = " + toplam);


        System.out.println("***********************DO WHILE COZUMU ******************************");

        toplam=0;
        index=0;

        do {
            toplam+=sayilar[index];
            index++;

        }while (index< sayilar.length);

        System.out.println("Toplam = " + toplam);
    }
}
