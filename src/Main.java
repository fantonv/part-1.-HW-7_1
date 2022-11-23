public class Main {
    public static void main(String[] args) {
        Author joan = new Author("Джордж", "Оруэлл");
        Book harryPotter1 = new Book(1948,"1984", joan);
        System.out.println(harryPotter1);
        harryPotter1.setYearBook(2002);
        System.out.println("harryPotter1.getYearBook() = " + harryPotter1.getYearBook());

        Author jordj = new Author("Джордж", "Оруэлл");
        Book book1984 = new Book(1948,"1984",jordj);
        System.out.println(book1984);
        book1984.setYearBook(2002);
        System.out.println("book1984.getYearBook() = " + book1984.getYearBook());
        if (book1984.hashCode() == harryPotter1.hashCode()){
            throw new RuntimeException("Такая книга уже есть!");
        }
    }
}