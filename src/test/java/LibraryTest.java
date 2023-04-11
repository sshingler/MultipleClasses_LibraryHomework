import org.junit.Before;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;


    @Before
    public void setup(){
        library = new Library();
        book1 = new Book ("The Hobbit", "JRR Tolkein", "Fantasy");
        book2 = new Book ("Lord of the Rings", "JRR Tolkein", "Fantasy");
    }


}
