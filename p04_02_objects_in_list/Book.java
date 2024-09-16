package p04_02_objects_in_list;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int bookPages, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.publicationYear = bookPublicationYear;
    }

    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public String getTitle(){
        return this.title;
    }
}
