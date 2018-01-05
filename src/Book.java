public class Book {

    private String bookName;
    private Name author;
    private int ISBN;

    public Book(String bookNameInput, Name authorInput, int ISBNInput) {
        bookName = bookNameInput;
        author = authorInput;
        ISBN = ISBNInput;
    }

    public String getBookName() {
        return bookName;
    }

    public Name getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }
}
