package SubClassesChallenges;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("returning the item");
    }
}
