import java.util.ArrayList;

class BankAccountSystem {
    public static void main(String[] args){
        BankAccount account =
                new BankAccount(
                        1001,"Rohit Joshi",10000
                );
        account.deposit(5000);

        account.withdraw(3000);

        account.deposit(2000);

        account.withdraw(50000);

        account.displayAccountDetails();

        System.out.println(
                "\n Current Balance : ₹"+account.getBalance()
        );

        account.displayTransactionHistory();
    }
}
