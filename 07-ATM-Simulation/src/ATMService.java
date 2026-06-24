import java.util.Scanner;

public class ATMService {
     private bankAccount account;
     public ATMService( bankAccount account){
         this.account=account;
     }

     public boolean authenticate(int enteredPIN){
         return enteredPIN==account.getPin();
     }

     public void startATM(){
         Scanner scanner =new Scanner(System.in);

         while(true){
             System.out.println(
                     "\n===== ATM MENU =====");

             System.out.println(
                     "1. Check Balance");

             System.out.println(
                     "2. Deposit");

             System.out.println(
                     "3. Withdraw");

             System.out.println(
                     "4. Transaction History");

             System.out.println(
                     "5. Exit");

             System.out.print(
                     "Enter Choice: ");

             int choice = scanner.nextInt();

             switch (choice){
                 case 1 :
                     System.out.println("Balance : ₹"+account.getBalance());
                     break;
                 case 2 :
                     System.out.println("Enter Amount: ₹");
                     double depositAmmount=scanner.nextDouble();
                     account.deposit(depositAmmount);
                     break;
                 case 3:
                     System.out.println("Enter Amount: ₹");
                     double withdrawAmount = scanner.nextDouble();
                     account.withdraw(withdrawAmount);
                     break;
                 case 4 :
                     account.showTransactions();
                     break;
                 case 5 :
                     System.out.println(
                             "Thank You");

                     return;

                 default:

                     System.out.println(
                             "Invalid Choice");
             }
         }
     }
}
