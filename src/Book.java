public class Book {

    //static variable
    static int totalBooks; //counter for total number of books

    //Non-static variable
    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    { //object init
        totalBooks++;
    }

    Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
       return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Sorry, this book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy reading " + this.title);
        }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Enjoyed it! Please provide the review of " + this.title + " book") ;
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "author", "design");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }



}
