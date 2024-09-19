package p04_03_files_and_reading_data;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try {
            Path path = Paths.get(StoringRecords.class.getResource(file).toURI()); 
            Scanner scanner = new Scanner(path); 

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(","); 
                String name = parts[0]; 
                int age = Integer.valueOf(parts[1]);

                Person person = new Person(name, age); 

                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;
    }
}
