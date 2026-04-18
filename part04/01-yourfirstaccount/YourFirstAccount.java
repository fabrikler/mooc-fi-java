
public class YourFirstAccount {

    public static void main(String[] args) {

        Account mainAccount = new Account("Main Account", 100.00);

        mainAccount.deposit(20.00);

        System.out.println(mainAccount);

    }
}
