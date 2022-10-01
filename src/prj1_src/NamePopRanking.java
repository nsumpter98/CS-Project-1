package prj1_src;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * The type Name pop ranking.
 */
public class NamePopRanking {
    private Baby[] babyArray;
    private int size;

    /**
     * Instantiates a new Name pop ranking.
     *
     * @param size the size
     */
    public NamePopRanking(int size) {
        this.size = size;
        babyArray = new Baby[size];
    }

    /**
     * Add baby.
     *
     * @param b the b
     */
    public void addBaby(Baby b) {
        for (int i = 0; i < size; i++) {
            if (babyArray[i] == null) {
                babyArray[i] = b;
                break;
            }
        }
    }


    /**
     * Display ranking.
     *
     * @param year the year
     */
    public void displayRanking(int year) {
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a gender
        System.out.print("Enter a gender: ");
        //store the user input in a variable
        String gender = scanner.next();
        //prompt the user to enter a name
        System.out.print("Enter a name: ");
        //store the user input in a variable
        String name = scanner.next();
        //create a counter
        int i = 0;
        //while the counter is less than the size of the array
        while (i < size) {
            //if the name in the array is equal to the name entered by the user

            if (babyArray[i].getName().equalsIgnoreCase(name.trim())) {
                if (babyArray[i].getGender().equalsIgnoreCase(gender.trim())) {
                    //print the ranking of the name
                    System.out.println((babyArray[i].getGender() == "M" ? "Boy name " : "Girl name ") + babyArray[i].getName() + " is ranked #" + babyArray[i].getRank() + " in the year " + year);
                    //break out of the loop
                    break;
                }
            }
            //increment the counter
            i++;
        }
    }


    /**
     * Both genders name set.
     *
     * @return the set
     */
    public Set<String> bothGendersName() {
        Set<String> names = new HashSet<>();
        Set<String> Mnames = new HashSet<>();
        Set<String> Fnames = new HashSet<>();
        int i = 0;
        while (i < size) {
            if (babyArray[i].getGender().equals("M")) {
                Mnames.add(babyArray[i].getName());
            } else {
                Fnames.add(babyArray[i].getName());
            }

            i++;
        }

        for (int j = 0; j < size; j++) {
            if (Mnames.contains(babyArray[j].getName()) && Fnames.contains(babyArray[j].getName())) {
                names.add(babyArray[j].getName());
            }

        }


        return names;
    }


    /**
     * Display ranking starting with.
     */
    public void displayRankingStartingWith() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender: ");
        String gender = scanner.next();
        System.out.print("Enter a string: ");
        String string = scanner.next();
        int i = 0;
        while (i < size) {
            if (babyArray[i].getName().toLowerCase().startsWith(string.toLowerCase()) && babyArray[i].getGender().equalsIgnoreCase(gender)) {
                System.out.println(babyArray[i].toString());
            }
            i++;
        }

    }


    /**
     * Random name starting with.
     */
    public void randomNameStartingWith() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender: ");
        String gender = scanner.next();
        System.out.print("Enter a string: ");
        String string = scanner.next();
        int i = 0;
        Set<String> names = new HashSet<>();
        while (i < size) {
            if (babyArray[i].getName().toLowerCase().startsWith(string.toLowerCase()) && babyArray[i].getGender().equalsIgnoreCase(gender)) {
                names.add(babyArray[i].getName());
            }
            i++;
        }
        String[] nameArray = new String[names.size()];
        int j = 0;
        for (String name : names) {
            nameArray[j] = name;
            j++;
        }
        Random rand = new Random();
        int randNum = rand.nextInt(names.size());
        System.out.println("Random name: " + nameArray[randNum]);
    }





}

