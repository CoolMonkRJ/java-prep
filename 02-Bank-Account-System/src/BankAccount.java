import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    private ArrayList<String> transactionHistory;

    public BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;

        transactionHistory = new ArrayList<>();

        transactionHistory.add("Account Created with Balance ₹ " + balance);
    }

    // add methods

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("INvalid Deposit Amount");
            return;
        }
        balance+=amount;
        transactionHistory.add("Deposited ₹ "+ amount);

        System.out.println("₹ "+amount+" deposited successfully");
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Inavlid Withdrawal Amount");
            return;
        }
        //handling overdraft comdition
        else
        if(amount>balance){
            transactionHistory.add("Failed Withdrawal ₹"+amount+"(Insufficient Balance");
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=amount;
        transactionHistory.add("Withdrawn ₹"+amount);

        System.out.println("₹"+amount+"Withdrawn successfully");
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println("\n -------- ACCOUNT DETAILS--------");

        System.out.println(
                "Account Number : "+accountNumber
        );
        System.out.println(
                "Account Holder :"+ accountHolderName
        );
        System.out.println(
                "Balance : ₹"+balance
        );
    }

    public void displayTransactionHistory(){
        System.out.println(
                "\n --------- TRANSACTION HISTORY----------"
        );

        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }

}
