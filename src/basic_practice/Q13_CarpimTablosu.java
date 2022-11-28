package basic_practice;

public class Q13_CarpimTablosu {
     /*
 Kullanicinin girdigi sayiya kadar carpim
 tablosunu bize yazdiran bir program yazacagiz
     */
     public static void main(String[] args) {
         int input=10;

         carpimTablosu(input);

     }
     private static void carpimTablosu(int input){

         for (int i = 0; i <= input; i++) {
             for (int j = 0; j <=input ; j++) {
                 System.out.printf("%4d",i*j );
             }
             System.out.println();
         }
     }
}
