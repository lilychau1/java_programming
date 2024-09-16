package p04_02_objects_in_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Example402c {
    public static void main(String[] args) {
        Scanner bookReader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = bookReader.nextLine();
            if (title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(bookReader.nextLine());

            System.out.print("Publication Year: ");
            int publicationYear = Integer.valueOf(bookReader.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        Scanner printReader = new Scanner(System.in);
        System.out.print("What information will be printed? (everything or title) ");
        String printScope = printReader.nextLine();

        bookReader.close();
        printReader.close();
        
        if (printScope.equalsIgnoreCase("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (printScope.equalsIgnoreCase("title")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid option. ");
        }
    }
}
