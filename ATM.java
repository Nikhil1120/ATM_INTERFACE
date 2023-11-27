import java.util.*;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        float balance = 0;
        int Depositamount = 0;
        int Withdrawamount = 0;

        String correctLoginName = "Anil";
        String correctPassword = "123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String LoginName = scanner.nextLine();

        System.out.println("Enter your password");
        String Password = scanner.nextLine();

        if (LoginName.equals(correctLoginName) && Password.equals(correctPassword)) {

            System.out.println("Welcome to ATM");
            System.out.println("======================");

            while (true) {

                System.out.println("press 1 to check your BALANCE");
                System.out.println("press 2 to DEPOSIT");
                System.out.println("press 3 to WITHDRAW");
                System.out.println("press 4 to TRANSACTION HISTORY");
                System.out.println("press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println(" how much amount did you want to Deposit to your account");
                        Depositamount = scanner.nextInt();
                        System.out.println(" successfuly credited");
                        System.out.println("======================");
                        balance = Depositamount + balance;
                        break;
                    case 3:
                        System.out.println("how much amount did you want to Withdraw");
                        Withdrawamount = scanner.nextInt();
                        if (Withdrawamount > balance) {
                            System.out.println("your balance is insufficient");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("successfully Debited");
                            System.out.println("===================");
                            balance = balance - Withdrawamount;
                        }
                        break;
                    case 4:
                        System.out.println("welcome to All in one mini ATM ");
                        System.out.println("avialable balance is " + balance);
                        System.out.println("amount deposited   " + Depositamount);
                        System.out.println("amount taken  " + Withdrawamount);
                        System.out.println("thanks for coming ");
                        System.out.println("====================");
                        break;
                    default:
                        System.out.println("press the number below 5 ");
                        break;

                }
                if (opt == 5) {
                    System.out.println("thank you ");
                    break;
                }

            }
        } else {
            System.out.println("Login failed");
        }
    }
}