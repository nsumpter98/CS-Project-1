package prj1_src;


import java.io.FileNotFoundException;

public class Loader {


    //enter year, gender, and name and display the ranking for the name
    public static void displayRanking(){
        System.out.println("1. Display the ranking of a name");
    }

    //enter "filename"(year) display the names that are used for both genders in that file/year
    public static void displayBothGendersName(){
        System.out.println("2. Display");
    }

    //enter "filename"(year), gender and some string to display the names and their rankings that begin with that specific string
    public static void displayRankingOfNameStartingWithALetter(){
        System.out.println("3. Display the ranking of a name starting with a letter");
    }


    public static void displayRandomNameStartingWithALetter(){
        System.out.println("4. Display a random name starting with a letter");
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


