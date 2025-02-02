public class Customer {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "Ravina");
        System.out.println(account.deposit(200));
        System.out.println(account.withdraw(300));
        account.withdraw(0);
        account.deposit(0);
        account.withdraw(-400);
        System.out.println(account.withdraw(150));
    }


}
