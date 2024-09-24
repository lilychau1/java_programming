package p06_02_user_interface;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner; 
    private SimpleDictionary dictionary; 

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner; 
        this.dictionary = dictionary; 
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine(); 
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break; 
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine(); 
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine(); 
                this.dictionary.add(word, translation);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("Word: ");
                String toBeTranslated = this.scanner.nextLine(); 
                String translation  = this.dictionary.translate(toBeTranslated); 
                if (translation == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation); 
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
