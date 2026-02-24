import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to q bank");
        System.out.println("select 1 for Current Account");
        System.out.println("select 2 for Saving Account");
        int choice = scan.nextInt();

        int balance = 5000;

        switch (choice) {
            case 1:
                System.out.println("select 1 for Deposit");
                System.out.println("select 2 for Withdraw");
                System.out.println("select 3 for Check Balance");
                int c = scan.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("enter the amount");
                        int amount = scan.nextInt();
                        balance += amount;
                        System.out.println("Deposit sucessfully");
                        System.out.println("balance : " + balance);
                        break;

                    case 2:
                        System.out.println("enter the amount");

                        System.out.println("withdraw sucessfully");

                        break;
                    case 3:
                        System.out.println("Balance");
                        break;
                    default:
                        System.out.println("Invalid");
                        break;

                    
                }
                break;

            default:
                break;
        }
    }
}
