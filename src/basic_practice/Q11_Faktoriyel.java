package basic_practice;

public class Q11_Faktoriyel {
    /*
    Parametre olarak int kabul eden ve sayinin faktoriyelini
    hesaplayan bir method yaziniz

    ORN :

    INPUT : 6 ;
    OUTPUT : 6!=6*5*4*3*2*1=720

     */
    public static void main(String[] args) {
        int sayi = 6;
        faktoriyel(sayi);
    }

    private static void faktoriyel(int input) {
        int fact=1;

        System.out.print(input+"!=");

        for (int i = input; i > 1 ; i--) {

            System.out.print(i+"*");
            fact*=i;
        }
        System.out.print("1="+fact);
    }
}
