package SubClassesChallenges;

public class Book extends LibraryItem{

    private String ISBN;

    Book (String ISBN){
        super();
        this.ISBN = ISBN;
    }

    public void someMethod(){
        checkOut();
        }

    public static void main(String[] args) {
        Book book1 = new Book("12");
        book1.checkOut();
    }

}
