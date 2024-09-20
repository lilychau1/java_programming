package p05_04_objects_and_references;

import java.util.ArrayList;
import java.util.Scanner;

public class Example504e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); 
        ArrayList<Book> books = new ArrayList<>(); 

        while (true) {
            System.out.println("Name (empty will stop): ");
            String name = reader.nextLine(); 

            if (name.isEmpty()) {
                break; 
            }

            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());
            
            Book bookToAdd = new Book(name, publicationYear); 
            if (books.contains(bookToAdd)) {
                System.out.println("The book is already on the list. Let's not add the same book again. ");
            } else {
                books.add(bookToAdd); 
            }
        }

        reader.close();
        System.out.println("");
        System.out.println("Thank you! Books added: " + books.size());
    }
}
