# Baby name popularity program

This program will allow you to display name ranking for the year,
display names that both genders share,
display names that start with input string, and
one random name that starts with some substring.

## How to use

The entry point of application is in Main.java

```java
public static void main(String[] args) throws FileNotFoundException {
        try{
            Menu.menu();
        }
        catch (Exception e){
            System.out.println("Unexpected Error");
            Menu.menu();
        }
    }
```

## Usage

The menu will display options 1 - 5 to guide the user through the different functions

```bash

1. Display the ranking of a name
2. Display both genders names that are the same
3. Display the ranking of a name starting with a letter
4. Display a random name starting with a letter
5. Exit
Enter your choice: 5


```
## Menu code
```java
 /**
     * Menu.
     *
     * @throws FileNotFoundException the file not found exception
     */
    public static void menu() throws FileNotFoundException {
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

```

## Contributing
Project is on GitHub at [CS-Project-1](https://github.com/nsumpter98/CS-Project-1)

## License
[MIT](https://choosealicense.com/licenses/mit/)
