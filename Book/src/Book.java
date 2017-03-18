/**
 * Created by todd on 18/3/17.
 */
public class Book {

    String title = new String();
    String description = new String();
    int year = 0;
    String isbn = new String ();
    String publisher = new String();

    // Default constructor - Published book (or at least have publisher)
    public Book (String title, String description, int year, String isbn, String publisher) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    // Secondary constructor - Do not know publisher
    public Book (String title, String description, int year) {
        this.title = title;
        this.description = description;
        this.year = year;
    }

    public String getTitle () {
        return this.title;
    }

    public String getDescription () {
        return this.description;
    }

    public int getYear () {
        return this.year;
    }

    public String getIsbn () {
        return this.isbn;
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher () {
        return this.publisher;
    }

    public void setPublisher (String publisher) {
        this.publisher = publisher;
    }


}
