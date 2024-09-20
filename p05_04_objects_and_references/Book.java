package p05_04_objects_and_references;

public class Book {
    private String name; 
    private int publicationYear; 

    public Book(String name, int publicationYear) {
        this.name = name; 
        this.publicationYear = publicationYear; 
    }

    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true; 
        }

        if (!(comparedObject instanceof Book)) {
            return false; 
        }

        Book comparedBook = (Book) comparedObject; 

        return this.name.equals(comparedBook.name); 
    }
}
