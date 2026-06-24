import java.util.Scanner;

public class ATMApplication {
public static void main(String[] args){
    bankAccount account = new bankAccount(
            1001,"Rahul",1234,10000);

    ATMService atmService = new ATMService(account);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter PIN :");
    int enteredPin= scanner.nextInt();

    if(atmService.authenticate(enteredPin)){
        System.out.println("Login Successfull");
        atmService.startATM();
    }
    else{
        System.out.println("Invalid PIN");
    }
}
}
