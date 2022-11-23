package day06;

import java.util.Random;
import java.util.Scanner;

public class Q1_TasKagitMakas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

        do {
            System.out.println("===========================================================\n" +
                    "Please make your choice: \n\t1 for Rock\n\t2 for Paper\n\t3 for Scissors");
            userChoise = scan.nextInt();
            compChoise = random.nextInt(3) + 1;

            if (userChoise == 1 & compChoise == 2) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Paper wraps Rock===> Computer +1 ");
                comp++;
                System.out.println("User = " + user + " Computer = " + comp);
            } else if (userChoise == 1 & compChoise == 3) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Rock smashs Scissors ===> User +1 ");
                user++;
                System.out.println("User = " + user + " Computer = " + comp);
            } else if (userChoise == 2 & compChoise == 1) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Paper wraps Rock===> User +1 ");
                user++;
                System.out.println("User = " + user + " Computer = " + comp);
            } else if (userChoise == 2 & compChoise == 3) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Scissors cuts Paper===> Computer +1 ");
                comp++;
                System.out.println("User = " + user + " Computer = " + comp);
            } else if (userChoise == 3 & compChoise == 2) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Scissors cuts Paper===> User +1 ");
                user++;
                System.out.println("User = " + user + " Computer = " + comp);
            } else if (userChoise == 3 & compChoise == 1) {
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " Rock smashs Scissors ===> Computer +1 ");
                comp++;
            } else {
                System.out.println("It's a tie");
                System.out.println("Your Choice = " + userChoise +  " | Computer's Choice = " + compChoise +
                        " User = " + user + " Computer = " + comp);

            }
        }while (user != 5 && comp != 5) ;{

                if (user > comp) System.out.println("*********************************\nYou are the Winner!!!!" +
                        "\n User = " + user + " Computer = "  + comp);
                else System.out.println("*********************************\nSorry, You are Loser :(" +
                        "\n\" User = + " + user + " Computer = " + comp);

            }


}


}
