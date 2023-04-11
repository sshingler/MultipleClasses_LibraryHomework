import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;


    @Before
    public void setup(){
        library = new Library();
        book1 = new Book ("The Hobbit", "JRR Tolkien", "Fantasy");
        book2 = new Book ("Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }
}
