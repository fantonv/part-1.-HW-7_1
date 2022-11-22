public class Book {
    private int yearBook;
    private String nameBook;
    private Author author;

    public Book(int yearBook, String nameBook, Author author){
        this.yearBook = yearBook;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearBook() {
        return this.yearBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public void setYearBook (int yearBook){
        this.yearBook = yearBook;
    }
}
