package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Container<Book> {

    List<Book> BookList;

    public BookShelf(){
        this.BookList = new ArrayList<>();
    }

    public void addBooks(Book book){
        this.BookList.add(book);
    }


    @Override
    public Iterator<Book> getIterator() {
        return  new BookShelfIterator(this.BookList);
    }
}
