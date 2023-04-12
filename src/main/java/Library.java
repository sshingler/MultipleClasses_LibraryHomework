import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Handler;

public class Library {

    private ArrayList<Book> books;

    public Library (){
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean bookInStock (String title) {
        for (Book book : books){
            if (book.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public HashMap< String, Integer> genreFrequencies(){
        HashMap <String, Integer> frequencies = new HashMap<>();

        for (Book book : books) {
            String genre = book.getGenre();
            if (!frequencies.containsKey(genre)){
                frequencies.put(genre, 1);
            } else {
                int previousFrequency = frequencies.get(genre);
                int newFrequency = previousFrequency + 1;
                frequencies.replace(genre, newFrequency);
            }
        }
     return frequencies;
    }


}
