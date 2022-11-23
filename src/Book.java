import java.util.Objects;

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

    public String toString() {
        return "Год книги " + this.yearBook + " Название книги " + this.nameBook + " Автор книги " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearBook, nameBook, author);
    }
}
