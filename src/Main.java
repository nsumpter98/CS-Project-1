import prj1_src.Menu;

import java.io.FileNotFoundException;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws FileNotFoundException the file not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        try{
            Menu.menu();
        }
        catch (Exception e){
            System.out.println("Unexpected Error");
            Menu.menu();
        }
    }
}