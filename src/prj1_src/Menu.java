package prj1_src;

import java.util.Scanner;

public class Menu {
   public static void cls(){
      for (int i = 0; i < 100; i++) {
         System.out.println();
      }
       System.out.println("##############################################");
       System.out.println("##############################################");

   }


    public static void menu() {
        cls();

        while (true){
            System.out.println("1. Display the ranking of a name");
            System.out.println("2. Display both genders names that are the same");
            System.out.println("3. Display the ranking of a name starting with a letter");
            System.out.println("4. Display a random name starting with a letter");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1){
                cls();
                Loader.displayRanking();
            }
            else if (choice == 2) {
                cls();
                Loader.displayBothGendersName();
            }
            else if (choice == 3) {
                cls();
                Loader.displayRankingOfNameStartingWithALetter();
            }
            else if (choice == 4) {
                cls();
                Loader.displayRandomNameStartingWithALetter();
            }
            else if (choice == 5) {
                cls();
                System.out.println("5. Exit");
                break;
            }
            else {
                cls();
                System.out.println("Invalid choice");
            }
            System.out.println("##############################################");
            System.out.println("##############################################\n");



        }
    }

}
