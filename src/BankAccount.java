public class BankAccount {
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;

    public double setBalance(){
        return balance;
    }


    public BankAccount (String AccountNumber, String AccountHolderName){
        this.AccountNumber = AccountNumber;
        this.AccountHolderName = AccountHolderName;
    }
    public double deposit(double money) {
        if (money <= 0) {
            System.out.println("Sorry, its invalid");
        } else {
            balance += money;
        }
        return money;
    }

    public double withdraw(double money) {

         if (money <= 0) {
             System.out.println("invalid withdrawl");
         }
            else if (balance >= money) {
                balance -= money;
         } else if (money > balance){
             System.out.println("You don't have this much amount in your account");
         }else {
            money = balance;
            balance = 0;
         }
        return money;
    }


}
