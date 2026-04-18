
public class YourFirstBankTransfer {

    public static void main(String[] args) {

        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My Account", 0 );

        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100);
    }
}
