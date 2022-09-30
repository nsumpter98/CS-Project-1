package prj1_src;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader {


    //enter year, gender, and name and display the ranking for the name
    public static void displayRanking()  {
        System.out.println("1. Display the ranking of a name");
        NamePopRanking n = load("src/txtFiles/babynamesranking2001.txt");
        System.out.println("finished loading");
        n.displayRanking();
    }

    //enter "filename"(year) display the names that are used for both genders in that file/year
    public static void displayBothGendersName(){
        System.out.println("2. Display");
        NamePopRanking n = load("src/txtFiles/babynamesranking2001.txt");
        System.out.println("finished loading");
        System.out.println(n.bothGendersName());
    }

    //enter "filename"(year), gender and some string to display the names and their rankings that begin with that specific string
    public static void displayRankingOfNameStartingWithALetter(){
        System.out.println("3. Display the ranking of a name starting with a letter");
        NamePopRanking n = load("src/txtFiles/babynamesranking2001.txt");
        System.out.println("finished loading");
        n.displayRankingStartingWith();
    }


    public static void displayRandomNameStartingWithALetter(){
        System.out.println("4. Display a random name starting with a letter");
        NamePopRanking n = load("src/txtFiles/babynamesranking2001.txt");
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
            System.out.println("Count: " + count);

            //create a counter
            int i = 0;
            //while the scanner has another line
            while (scanner.hasNextLine()) {
                //create a new string and set it to the next line
                String line = scanner.nextLine();
                //create a new string array and set it to the line split by commas
                String[] lineArray = line.replaceAll("\\s+", " ").split(" ");
                //create a new NamePopRanking object and set it to the array
                Baby namePopRanking1 = new Baby(lineArray[1],Integer.parseInt(lineArray[0]) ,0, "M");
                Baby namePopRanking2 = new Baby(lineArray[3], Integer.parseInt(lineArray[0]),0, "F");
                //add the NamePopRanking object to the array
                namePopRanking.addBaby(namePopRanking1);
                namePopRanking.addBaby(namePopRanking2);
                //increment the counter
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        //return the NamePopRanking object
        return namePopRanking;
    }

    public static void main(String[] args) {
        String t = "src\\txtFiles";


        //create a new NamePopRanking object
        NamePopRanking namePopRanking = new NamePopRanking(5);
        //create a new NameRandomStarting object
        NameRandomStarting nameRandomStarting = new NameRandomStarting();
        //create a new Baby object
        Baby baby = new Baby("John", 1, 100, "M");
        Baby baby2 = new Baby("Barb", 2, 200, "F");
        Baby baby4 = new Baby("Beth", 2, 200, "F");
        Baby baby5 = new Baby("Beet", 2, 200, "F");
        Baby baby3 = new Baby("John", 2, 200, "F");
        //add the baby to the NamePopRanking object
        namePopRanking.addBaby(baby);
        namePopRanking.addBaby(baby2);
        namePopRanking.addBaby(baby3);
        namePopRanking.addBaby(baby4);
        namePopRanking.addBaby(baby5);



        namePopRanking.randomNameStartingWith();

        namePopRanking.displayRankingStartingWith();



        //print out set of names from loadNames function
        System.out.println(namePopRanking.bothGendersName() + " " + namePopRanking.bothGendersName().size());

        //display the ranking of the name
        namePopRanking.printBabyArray();
        //display the ranking of the baby
        namePopRanking.displayRanking();
        //try to get a random name from the file
        try {
            //print the random name
            //System.out.println(nameRandomStarting.randomName("src/prj1_src/names.txt"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }




}


