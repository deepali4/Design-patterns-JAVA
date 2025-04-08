package Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        Book Book1 = new Book();
        Book Book2 = new Book();
        Book1.setBookName("BHAGWAT GEETA");
        Book1.setPrice(400);

        Book2.setBookName("MAHABHARTA");
        Book2.setPrice(400);

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBooks(Book1);
        bookShelf.addBooks(Book2);

        Iterator<Book> Itr = bookShelf.getIterator();

        System.out.println("Books int he shelf");

        while (Itr.hasNext()){
            Book book = Itr.next();
            System.out.println(book.getBookName());
        }
    }
}
