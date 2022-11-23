package day04;

public class StringdekiSayilariTopla {

    /*
     * write a method which accepts a String as parameter
     * and prints the sum of the digits, present in the given string
     *
     * Parametre olarak bir String kabul eden ve verilen Stringde
     * bulunan rakamların toplamını yazdiran bir method yazın.
     *
     * Input : ade1r4d3
     * Output : 1+4+3 = 8
     *
     * Use Character.isDigit()
     *     Integer.valueOf()
     */
    public static void main(String[] args) {
       String kelime="ade1r4d3";
rakamlarinToplami(kelime);

    }
    public static void rakamlarinToplami(String input){

        int toplam=0;

        for (int i = 0; i < input.length(); i++) {

            if(Character.isDigit(input.charAt(i))){
                toplam+=Integer.valueOf(""+input.charAt(i));  // hiçlik işareti olmazsa toplam 152
            }


        }

        System.out.println("Rakamlarin toplami " + toplam);
    }
}
