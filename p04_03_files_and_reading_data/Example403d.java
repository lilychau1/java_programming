package p04_03_files_and_reading_data;

import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Example403d {
    public static void main(String[] args) {
        System.out.print("File? ");

        Scanner scanner = new Scanner(System.in); 
        String fileToRead = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine()); 
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine()); 

        int numberOfMatches = 0; 

        try {
            Path path = Paths.get(Example403d.class.getResource(fileToRead).toURI());   
            Scanner numberScanner = new Scanner(path); 
            
            while (numberScanner.hasNextLine()) {
                String line = numberScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                int number = Integer.valueOf(line);
                if (number >= lowerBound & number <= upperBound) {
                    numberOfMatches++; 
                }
            }
            numberScanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Numbers: " + numberOfMatches);
        scanner.close();
    }
}
