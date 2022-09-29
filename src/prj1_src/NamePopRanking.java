package prj1_src;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NamePopRanking {
    private Baby[] babyArray;
    private int size;

    public NamePopRanking(int size) {
        this.size = size;
        babyArray = new Baby[size];
    }

    public void addBaby(Baby b) {
        for (int i = 0; i < size; i++) {
            if (babyArray[i] == null) {
                babyArray[i] = b;
                break;
            }
        }
    }

    public void addBabys(Baby[] b) {
        babyArray = b;
    }

    // prompt the user to enter year, gender, and name and display the
    //ranking for the name.
    public void displayRanking() {
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.println("Enter a year: ");
        //store the user input in a variable
        int year = scanner.nextInt();
        //prompt the user to enter a gender
        System.out.println("Enter a gender: ");
        //store the user input in a variable
        String gender = scanner.next();
        //prompt the user to enter a name
        System.out.println("Enter a name: ");
        //store the user input in a variable
        String name = scanner.next();
        //create a counter
        int i = 0;
        //while the counter is less than the size of the array
        while (i < size) {
            //if the name in the array is equal to the name entered by the user
            System.out.println(babyArray[i].getName());
            System.out.println(babyArray[i].getGender());
            if (babyArray[i].getName().equals(name.trim())) {
                if (babyArray[i].getGender().equals(gender.trim())) {
                    //print the ranking of the name
                    System.out.println("Rank: " + babyArray[i].getRank());
                    //break out of the loop
                    break;
                }
            }
            //increment the counter
            i++;
        }
    }


    //function to load all the data from the babyArray into Set<String>
//and return the set
    public Set<String> bothGendersName() {
        //create a new set
        Set<String> names = new HashSet<>();
        Set<String> Mnames = new HashSet<>();
        Set<String> Fnames = new HashSet<>();
        //create a counter
        int i = 0;
        //while the counter is less than the size of the array
        while (i < size) {
            if (babyArray[i].getGender().equals("M")) {
                //add the name to the set
                Mnames.add(babyArray[i].getName());
            } else {
                Fnames.add(babyArray[i].getName());
            }
            //add the name in the array to the set

            //increment the counter
            i++;
        }

        for (int j = 0; j < size; j++) {
            if (Mnames.contains(babyArray[j].getName()) && Fnames.contains(babyArray[j].getName())) {
                //add the name to the set
                names.add(babyArray[j].getName());
            }

        }


        //return the set
        return names;
    }


    //prompts the user to enter gender, and string and
//display the names and their rankings that begin with the specific string.
    public void displayRankingStartingWith() {
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter gender
        System.out.println("Enter gender: ");
        //store the user input in a variable
        String gender = scanner.next();
        //prompt the user to enter a string
        System.out.println("Enter a string: ");
        //store the user input in a variable
        String string = scanner.next();
        //create a counter
        int i = 0;
        //while the counter is less than the size of the array
        while (i < size) {
            //if the name in the array starts with the string entered by the user
            if (babyArray[i].getName().startsWith(string) && babyArray[i].getGender().equals(gender)) {
                //print the name and the ranking
                System.out.println("Name: " + babyArray[i].getName() + " Rank: " + babyArray[i].getRank());
            }
            //increment the counter
            i++;
        }

    }


    // Find a random name start with a letter or substring from user input
    public void randomNameStartingWith() {
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter gender
        System.out.println("Enter gender: ");
        //store the user input in a variable
        String gender = scanner.next();
        //prompt the user to enter a string
        System.out.println("Enter a string: ");
        //store the user input in a variable
        String string = scanner.next();
        //create a counter
        int i = 0;
        //create a new set
        Set<String> names = new HashSet<>();
        //while the counter is less than the size of the array
        while (i < size) {
            //if the name in the array starts with the string entered by the user
            if (babyArray[i].getName().startsWith(string) && babyArray[i].getGender().equals(gender)) {
                //add the name to the set
                names.add(babyArray[i].getName());
            }
            //increment the counter
            i++;
        }
        //create a new array
        String[] nameArray = new String[names.size()];
        //create a counter
        int j = 0;
        //for each name in the set
        for (String name : names) {
            //add the name to the array
            nameArray[j] = name;
            System.out.println(nameArray[j]);
            //increment the counter
            j++;
        }
        System.out.println(nameArray.toString());
        //create a random number generator
        Random rand = new Random();
        //create a random number
        int randNum = rand.nextInt(names.size() + 1);
        //print the random name
        System.out.println("Random name: " + nameArray[randNum]);
    }


    public void printBabyArray() {
        for (int i = 0; i < size; i++) {
            if (babyArray[i] != null) {
                System.out.println(babyArray[i].toString());
            }
        }
    }



}

