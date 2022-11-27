package day07;

public class MaxAndMinNumberInArrays {

    // Verilen bir Array'in icerisindeki en buyuk ve en kucuk sayilari
    // bulan methodlari sort methodunu kullanmadan yaziniz.

    static int bosKova;

    public static void main(String[] args) {

        int[] numbers = {12, 98, -35, 23, 19, 99,};

        maxnumberArray(numbers);
        minnumberArray(numbers);

    }

    private static void minnumberArray(int[] array) {
        bosKova = array[0];
        for (int each : array) {
            if (each < bosKova) {
                bosKova = each;
            }
        }

        System.out.println("Array'in en kucuk elemani = " + bosKova);
    }


    private static void maxnumberArray(int[] array) {

        bosKova = array[0];
        for (int each : array) {
            if (each > bosKova) {
                bosKova = each;

            }
        }

        System.out.println("Array'in en buyuk elemani = " + bosKova);
    }
}