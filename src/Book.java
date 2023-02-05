public class Book {
    private String bookTitle;
    private Autor autor;
    private int publishingYear;
    public Book (String bookTitle, Autor author, int publishingYear){
        this.autor = author;
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
    public void setpublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

}

