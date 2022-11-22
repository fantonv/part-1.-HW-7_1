public class Main {
    public static void main(String[] args) {
        Author joan = new Author("Джоан", "Роллинг");
        Book harryPotter1 = new Book(2001,"Harry potter", joan);
        System.out.println(harryPotter1.getNameBook() + " " + harryPotter1.getYearBook() + " "
                + harryPotter1.getAuthor());
        harryPotter1.setYearBook(2002);
        System.out.println("harryPotter1.getYearBook() = " + harryPotter1.getYearBook());

        Author jordj = new Author("Джордж", "Оруэлл");
        Book book1984 = new Book(1948,"1984",jordj);
        System.out.println(book1984.getYearBook() + " " + book1984.getNameBook() + " " +
                book1984.getAuthor());
        book1984.setYearBook(1949);
        System.out.println("book1984.getYearBook() = " + book1984.getYearBook());

    }
}