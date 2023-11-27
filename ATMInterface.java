import java.util.Scanner;

public class ATMInterface {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount("Nikhil", "1120");
		Scanner scanner = new Scanner(System.in);

		// Define correct login name and password
		String correctLoginName = "Nikhil";
		String correctPassword = "1120";

		// Prompt the user to enter login name and password
		System.out.print("Enter your login name: ");
		String loginName = scanner.nextLine();

		System.out.print("Enter your password: ");
		String password = scanner.nextLine();

		// Check if the entered login name and password are correct
		if (loginName.equals(correctLoginName) && password.equals(correctPassword)) {
			System.out.println("Login successful. ATM functionality unlocked.");
			obj.showMenu();
		} else {
			System.out.println("Login Failed");
		}

	}

}

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	void Deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Successfully withdrew: " + amount);
		} else {
			System.out.println("Error: Please enter an amount less than or equal to your balance.");
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction + "withdrawn:" + previousTransaction);
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("A : Check Account Balance");
		System.out.println("B : Deposit Money");
		System.out.println("G : Available Balance");
		System.out.println("C : Withdraw Money");
		System.out.println("D : Previous Transaction Details");

		System.out.println("Q : Exit");
		do {
			System.out.println("************************************");
			System.out.println("Enter your Option");
			System.out.println("************************************");

			option = scanner.next().charAt(0);

			switch (option) {
				case 'A':
					System.out.println("------------------------------------");
					System.out.println("Account Balance= " + balance);
					System.out.println("------------------------------------");
					System.out.println("\n");
					break;

				case 'B':
					System.out.println("------------------------------------");
					System.out.println("Enter an amount to deposit");
					System.out.println("------------------------------------");
					int amount = scanner.nextInt();
					Deposit(amount);
					System.out.println("Amount deposited in the account = " + amount);
					System.out.println("\n");
					break;
				case 'G':
					System.out.println("------------------------------------");
					System.out.println("Available Balance= " + balance);
					System.out.println("------------------------------------");
					System.out.println("\n");
					break;

				case 'C':
					System.out.println("------------------------------------");
					System.out.println("Enter an amount to withdraw");
					System.out.println("------------------------------------");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("Amount withdrawn from the account = " + amount2);
					System.out.println("\n");
					break;

				case 'D':
					System.out.println("------------------------------------");
					System.out.println("Your previous transaction status is: \n ");
					getPreviousTransaction();
					System.out.println("--------------------------------------");
					System.out.println("\n");
					break;

				case 'Q':
					System.out.println("Preparing to exit...");
					break;

				default:
					System.out.println("Invalid option!! please enter one of the valid options: A,B,G,C,D,E,F,Q...");
					break;
			}
		} while (option != 'Q');
		System.out.println("Thank you for using our services......!!");

	}
}
