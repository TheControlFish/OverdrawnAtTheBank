import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Initial Balance: ");
		double start = kb.nextDouble();
		System.out.print("Name (First_Last): ");
		String name = kb.next();
		BankAccount myAccount = new BankAccount(start, name);
		myAccount.deposit(505.22);
		System.out.println("\nBalance: " + myAccount.balance);
		myAccount.withdraw(100);
		System.out.println("The " + name + " account balance is: " + myAccount.balance);
	}

}
