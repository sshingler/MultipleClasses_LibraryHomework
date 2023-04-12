import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void setup(){
        library = new Library();
        book1 = new Book ("The Hobbit", "JRR Tolkien", "Fantasy");
        book2 = new Book ("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book3 = new Book( "The Railway Children", "Edith Nesbit", "Classics" );
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

    @Test
    public void hasBookWithTitleTrue(){
        library.addBook(book1);
        assertTrue(library.bookInStock("The Hobbit"));
    }

    @Test
    public void hasBookWithTitleFalse(){
        library.addBook(book2);
        assertFalse(library.bookInStock("The Hobbit"));
    }

    @Test
    public void checkGenreFrequencies(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        HashMap< String, Integer> frequencies = library.genreFrequencies();

        int numberOfClassics = frequencies.get("Classics");
        assertEquals(1, numberOfClassics);

        int numberOfFantasy = frequencies.get("Fantasy");
        assertEquals(2, numberOfFantasy);
    }
}
