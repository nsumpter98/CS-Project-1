package prj1_src;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 * The type Loader.
 */
public class Loader {


    /**
     * Display ranking.
     */
    public static void displayRanking()  {
        System.out.println("1. Display the ranking of a name");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between [2001 - 2010]: ");
        int year = scanner.nextInt();
        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        n.displayRanking(year);
    }

    /**
     * Display both genders name.
     */
    public static void displayBothGendersName(){
        System.out.println("2. Display");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between [2001 - 2010]: ");
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        Set<String> names = n.bothGendersName();
        System.out.println(names.size() + " names used for both genders");
        System.out.print("There are ");
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println("\n");
    }

    /**
     * Display ranking of name starting with a letter.
     */
    public static void displayRankingOfNameStartingWithALetter(){
        System.out.println("3. Display the ranking of a name starting with a letter");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between [2001 - 2010]: ");
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        n.displayRankingStartingWith();
    }


    /**
     * Display random name starting with a letter.
     */
    public static void displayRandomNameStartingWithALetter(){
        System.out.println("4. Display a random name starting with a letter");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between [2001 - 2010]: ");
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        n.randomNameStartingWith();
    }

    /**
     * Load name pop ranking.
     *
     * @param filename the filename
     * @return the name pop ranking
     */
    public static NamePopRanking load(String filename)  {
        NamePopRanking namePopRanking = null;

        try{
            Scanner scanner = new Scanner(new File(filename));
            Scanner scanner2 = new Scanner(new File(filename));
            int count = 0;
            while (scanner2.hasNextLine()) {
                count++;
                scanner2.nextLine();
            }
            namePopRanking = new NamePopRanking(count);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArray = line.replaceAll("\\s+", " ").split(" ");

                Baby babyM = new Baby(lineArray[1],Integer.parseInt(lineArray[0]) ,lineArray[2], "M");
                Baby babyF = new Baby(lineArray[3], Integer.parseInt(lineArray[0]),lineArray[4], "F");

                namePopRanking.addBaby(babyM);
                namePopRanking.addBaby(babyF);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        return namePopRanking;
    }




}


