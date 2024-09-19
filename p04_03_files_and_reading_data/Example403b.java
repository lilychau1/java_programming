package p04_03_files_and_reading_data;

import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Example403b {
    public static void main(String[] args) {
        Scanner fileToReadScanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed? ");
        String fileToRead = fileToReadScanner.nextLine();

        try {
            Path path = Paths.get(Example403b.class.getResource(fileToRead).toURI()); 
            Scanner contentReadScanner = new Scanner(path);

            while (contentReadScanner.hasNextLine()) {
                String row = contentReadScanner.nextLine();
                System.out.println(row);
            }

            contentReadScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
