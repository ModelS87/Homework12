import java.util.Objects;

public class Book {
    private String bookTitle;
    private Autor autor;
    private int publishingYear;

    public Book(String bookTitle, Autor autor, int publishingYear) {
        this.autor = autor;
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getpublishingYear() {
        return this.publishingYear;
    }

    public void setpublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


    @Override
    public String toString() {
        return "Год издания: " + publishingYear + " " + autor + " название: " + bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookTitle, book.bookTitle)
                && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle,publishingYear,autor);
    }
}


