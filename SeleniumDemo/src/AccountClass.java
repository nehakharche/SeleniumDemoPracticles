import java.util.Scanner;

/**
 * @author Neha
 *
 */
public class AccountClass {
	static Scanner sc = new Scanner(System.in);
	static String str_AccountType = "";
	static String str_OP = "";
	static int intAmount;
	static String str_option = "";
	static Account objSavingAccount = new SavingAccount();
	static Account objCurrentAccount = new CurrentAccount();

	public static void main(String[] args) {

		do {
			System.out.println("Please Select Account Type:- \t 1. Saving \t 2.Current \t 3.Exit");
			str_AccountType = sc.next();
			switch (str_AccountType) {
			case "1":
				System.out.println(
						"Please Select Opeartion :- \n 1. Account Balance \n 2.Withdraw \n 3.Deposit \n 4.Exit \n");
				str_OP = sc.next();
				switch (str_OP) {
				case "1":
					System.out.println("Total Balance is:- " + objSavingAccount.totalBalance());
					break;
				case "2":
					System.out.println("Please Enter Amount");
					intAmount = sc.nextInt();
					objSavingAccount.withdraw(intAmount);
					break;
				case "3":
					System.out.println("Please Enter Amount");
					intAmount = sc.nextInt();
					objSavingAccount.deposit(intAmount);
					break;
				case "4":
					System.out.println("Thank you");
					break;
				}
				break;
			case "2":
				System.out.println(
						"Please Select Opeartion :- \n 1. Account Balance \n 2.Withdraw \n 3.Deposit \n 4.Exit \n");
				str_OP = sc.next();
				switch (str_OP) {
				case "1":
					System.out.println("Total Balance is:- " + objCurrentAccount.totalBalance());
					break;
				case "2":
					System.out.println("Please Enter Amount");
					intAmount = sc.nextInt();
					objCurrentAccount.withdraw(intAmount);
					break;
				case "3":
					System.out.println("Please Enter Amount");
					intAmount = sc.nextInt();
					objCurrentAccount.deposit(intAmount);
					break;
				case "4":
					System.out.println("Thank you");
					break;
				}
				break;
			case "3":
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Do you want to continue?");
				str_option = sc.next();

			}
		} while (str_option.equalsIgnoreCase("Yes"));

	}
}

  abstract class Account {
	public static double total_Balance;

	public Double totalBalance() {
		total_Balance = 10000;
		return total_Balance;
	}

	public abstract void withdraw(int amount);

	public abstract void deposit(int amount);
}

class SavingAccount extends Account {
	public void withdraw(int amount) {
		
		this.accountInformation();
		if (this.totalBalance() > amount) {
			total_Balance = this.totalBalance() - amount;
			System.out.println("Total Balance is:- " + total_Balance);
		} else
			System.out.println("Your Account Balance is only " + this.totalBalance());
	}

	public void accountInformation() {
		System.out.println("Account Information:- Saving Account");
	}

	public void deposit(int amount) {
		total_Balance = total_Balance + amount;
		System.out.println("Account Balance is" + total_Balance);
	}
	public void deposit(double amount) {
		total_Balance = total_Balance + amount;
		System.out.println("Account Balance is" + total_Balance);
	}
	public void deposit(float amount) {
		total_Balance = total_Balance + amount;
		System.out.println("Account Balance is" + total_Balance);
	}
	public void deposit(long amount) {
		total_Balance = total_Balance + amount;
		System.out.println("Account Balance is" + total_Balance);
	}
}

class CurrentAccount extends Account {
	public void accountInformation() {
		System.out.println("Account Information:-Current Account");
	}

	public void withdraw(int amount) {
		this.accountInformation();
		if (this.totalBalance() > amount) {
			total_Balance = this.totalBalance() - amount;
			System.out.println("Total Balance is:- " + total_Balance);
		} else
			System.out.println("Your Account Balance is only " + this.totalBalance());
	}

	public void deposit(int amount) {
		total_Balance = total_Balance + amount;
		System.out.println("Account Balance is" + total_Balance);
	}
}
