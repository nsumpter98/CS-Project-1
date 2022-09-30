package prj1_src;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader {


    //enter year, gender, and name and display the ranking for the name
    public static void displayRanking()  {
        System.out.println("1. Display the ranking of a name");
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.println("Enter a year: ");
        //store the user input in a variable
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        System.out.println("finished loading");
        n.displayRanking();
    }

    //enter "filename"(year) display the names that are used for both genders in that file/year
    public static void displayBothGendersName(){
        System.out.println("2. Display");
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.println("Enter a year: ");
        //store the user input in a variable
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        System.out.println("finished loading");
        System.out.println(n.bothGendersName());
    }

    //enter "filename"(year), gender and some string to display the names and their rankings that begin with that specific string
    public static void displayRankingOfNameStartingWithALetter(){
        System.out.println("3. Display the ranking of a name starting with a letter");
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.println("Enter a year: ");
        //store the user input in a variable
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        System.out.println("finished loading");
        n.displayRankingStartingWith();
    }


    public static void displayRandomNameStartingWithALetter(){
        System.out.println("4. Display a random name starting with a letter");
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.println("Enter a year: ");
        //store the user input in a variable
        int year = scanner.nextInt();

        NamePopRanking n = load("src/txtFiles/babynamesranking"+year+".txt");
        System.out.println("finished loading");
        n.randomNameStartingWith();
    }

    public static NamePopRanking load(String filename)  {
        //create a new NamePopRanking object
        //create a new scanner
        NamePopRanking namePopRanking = null;

        try{
            Scanner scanner = new Scanner(new File(filename));
            Scanner scanner2 = new Scanner(new File(filename));
            //count number of lines in file
            int count = 0;
            while (scanner2.hasNextLine()) {
                count++;
                scanner2.nextLine();
            }
            namePopRanking = new NamePopRanking(count);

            //create a counter
            int i = 0;
            //while the scanner has another line
            while (scanner.hasNextLine()) {
                //create a new string and set it to the next line
                String line = scanner.nextLine();
                //create a new string array and set it to the line split by commas
                String[] lineArray = line.replaceAll("\\s+", " ").split(" ");
                //create a new NamePopRanking object and set it to the array
                Baby babyM = new Baby(lineArray[1],Integer.parseInt(lineArray[0]) ,0, "M");
                Baby babyF = new Baby(lineArray[3], Integer.parseInt(lineArray[0]),0, "F");
                //add the NamePopRanking object to the array
                namePopRanking.addBaby(babyM);
                namePopRanking.addBaby(babyF);
                //increment the counter
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        //return the NamePopRanking object
        return namePopRanking;
    }




}


