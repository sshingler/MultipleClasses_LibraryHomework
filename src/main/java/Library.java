import java.util.ArrayList;

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

//    public boolean hasBookWithTitle(String title) {
//        for (Book book : books){
//            if (book.getTitle().equals(title)){
//                return true;
//            }
//        }
//        return false;
//    }


}
