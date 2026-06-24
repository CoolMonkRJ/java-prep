import java.util.ArrayList;

public class bankAccount {

    private int accountNumber;
    private String accountHolder;
    private int pin;
    private double balance;

    private ArrayList<String> transactionHistory;

    public bankAccount(
            int accountNumber,
            String accountHolder,
            int pin,
            double balance){
              this.accountNumber=accountNumber;
              this.accountHolder=accountHolder;
              this.pin=pin;
              this.balance= balance;

              transactionHistory = new ArrayList<>();

              transactionHistory.add(
                      "Account Created with ₹"+balance
              );
    }

    public int getPin(){
        return pin;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Inavlid Amount");
            return;
        }
        balance+=amount;

        transactionHistory.add("Deposited : ₹" + amount);
        System.out.println("Deposit Successful");
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Inavlid Amount");
            return;
        } else if (amount> balance) {
            transactionHistory.add(
                    "Failed Withdrawal ₹" + amount);
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=amount;

        transactionHistory.add("Withdrawn : ₹"+amount);
        System.out.println("Withdrawal Successfull");
    }

    public void showTransactions(){
        System.out.println("\n ---------Transactional History----------");
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }

}
