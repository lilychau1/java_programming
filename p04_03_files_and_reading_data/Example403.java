package p04_03_files_and_reading_data;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Example403 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get(Example403.class.getResource("example403.txt").toURI()); 
            
            Scanner scanner = new Scanner(path); 

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
                }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
