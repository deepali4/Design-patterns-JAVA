package Iterator;

import java.util.List;

public class BookShelfIterator implements Iterator{

    List<Book> books;
    BookShelfIterator(List<Book> bookList){
        this.books = bookList;
    }
    private int index;
    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
       if(this.hasNext())
           return books.get(index++);
       return null;
    }
}
