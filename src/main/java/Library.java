import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library (){
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }
}
