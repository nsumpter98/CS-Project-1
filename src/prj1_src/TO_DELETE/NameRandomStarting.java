package prj1_src.TO_DELETE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class NameRandomStarting {
    //function that reads a .txt file from user input
    //and returns a random name from the file
    public static String randomName(String fileName) throws FileNotFoundException {
        //create a new file object
        File file = new File(fileName);
        //create a new scanner object
        Scanner scanner = new Scanner(file);
        //create a new string array
        String[] names = new String[1000];
        //create a counter
        int i = 0;
        //while there is another line in the file
        while (scanner.hasNextLine()) {
            //add the next line to the array
            names[i] = scanner.nextLine();
            //increment the counter
            i++;
        }
        //create a random number generator
        Random rand = new Random();
        //create a random number
        int randNum = rand.nextInt(1000);
        //return the random name
        return names[randNum];
    }
}
