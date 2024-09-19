package p04_03_files_and_reading_data;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Example403c {
    public static void main(String[] args) {
        System.out.println("Name of the file: ");
        Scanner fileToReadScanner = new Scanner(System.in);
        String fileToRead = fileToReadScanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        try {
            Path path = Paths.get(Example403c.class.getResource(fileToRead).toURI());
            Scanner nameScanner = new Scanner(path);

            while (nameScanner.hasNextLine()) {
                names.add(nameScanner.nextLine()); 
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter names, an empty line quits.");
        Scanner inputScanner = new Scanner(System.in); 

        while (true) {
            String inputName = inputScanner.nextLine();

            if (inputName.isEmpty()) {
                System.out.println("Thank you!");
                break;
            }

            if (names.contains(inputName)) {
                System.out.println("The name is on the list");
            } else {
                System.out.println("The name is not on the list");
            }
        }

    }
}
