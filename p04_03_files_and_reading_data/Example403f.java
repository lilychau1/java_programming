package p04_03_files_and_reading_data;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Example403f {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); 

        System.out.println("File: ");
        String fileToRead = inputScanner.nextLine().trim();

        System.out.println("Team: ");
        String team = inputScanner.nextLine().trim(); 

        int numberOfGames = 0; 
        int numberOfWins = 0; 
        int numberOfLosses = 0; 

        try {
            Path path = Paths.get(Example403f.class.getResource(fileToRead).toURI()); 
            Scanner playScanner = new Scanner(path); 

            while (playScanner.hasNextLine()) {
                String line = playScanner.nextLine().trim(); 
                String[] parts = line.split(","); 

                int homeScore = Integer.valueOf(parts[2]); 
                int visitingScore = Integer.valueOf(parts[3]); 

                if (parts[0].equalsIgnoreCase(team)) {
                    numberOfGames++; 
                    if (homeScore > visitingScore) {
                        numberOfWins++; 
                    } else if (homeScore < visitingScore) {
                        numberOfLosses++; 
                    }
                } else if (parts[1].equalsIgnoreCase(team)) {
                    numberOfGames++; 
                    if (homeScore < visitingScore) {
                        numberOfWins++; 
                    } else if (homeScore > visitingScore) {
                        numberOfLosses++; 
                    }
                }
                
            }
            playScanner.close(); 

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        inputScanner.close();

        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + numberOfWins);
        System.out.println("Losses: " + numberOfLosses);
    }
}
