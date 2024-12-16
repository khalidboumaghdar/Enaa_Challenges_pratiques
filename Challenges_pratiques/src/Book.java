public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
    public String add(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
//    System.out.println("Book- Name: " + book.getTitle()+ ", Auther: " + book.getAuthor()+ ", ISBN: " + book.getISBN());

        return book.toString();
    }
public void remove(){
        title = null;
        author = null;
        ISBN = null;
        System.out.println("Books removed");
}
}
