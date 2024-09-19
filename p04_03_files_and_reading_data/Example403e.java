package p04_03_files_and_reading_data;

import java.util.ArrayList;
import java.util.Scanner;

public class Example403e {
    public static void main(String[] args) {
        System.out.println("Name of the file: ");
        Scanner fileToReadScanner = new Scanner(System.in);
        String fileToRead = fileToReadScanner.nextLine(); 

        ArrayList<Person> persons = StoringRecords.readRecordsFromFile(fileToRead);
        for (Person person:persons) {
            System.out.println(person);
        }
        fileToReadScanner.close();
    }
}
