import java.util.HashMap;

public class Library {

    private HashMap<Integer, Book> ISBNMap = new HashMap<>();

    public Library() {}

    public void addBook(Book book) {
        if(ISBNMap.containsKey(book.getISBN())) {
            System.out.println("Book already in database.");
        }
        else {
            ISBNMap.put(book.getISBN(), book);
        }
    }

    public Book findBookISBN(int ISBN) {
        if(!ISBNMap.containsKey(ISBN)) {
            System.out.println("Book not in database.");
            return null;
        }
        return ISBNMap.get(ISBN);
    }
}
