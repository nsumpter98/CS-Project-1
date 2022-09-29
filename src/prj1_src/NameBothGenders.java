package prj1_src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameBothGenders {
    //function that reads a .txt file
    //and returns a string array of all the names
    public static String[] readNames(String fileName) throws FileNotFoundException {
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
        //return the array
        return names;
    }

}
