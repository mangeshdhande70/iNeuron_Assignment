
/*
 * Write a Java program that takes an integer from the user and throws an exception
   if it is negative.Demonstrate Exception handling of same program as solution.
 * 
 */

package in.ineuron;

import java.util.Scanner;

import in.ineuron.service.BankServiceImpl;
import in.ineuron.service.IBankService;

public class Runner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		IBankService service = new BankServiceImpl();

		while (true) {

			System.out.println(" Select your choice ");
			System.out.println("\n1. To Check Balance");
			System.out.println("2. To Withdraw");
			System.out.println("3. To Deposite");
			System.out.println("4. exit()");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println(service.checkBalance());
				;
				break;

			case 2:
				System.out.println("Enter Amount to withdraw :: ");
				Float amount = scanner.nextFloat();
				System.out.println(service.withdraw(amount));
				break;

			case 3:
				System.out.println("Enter Amount to withdraw :: ");
				Float amount1 = scanner.nextFloat();
				System.out.println(service.deposite(amount1));
				;

			case 4:
				System.out.println("Exit From the Application");
				System.exit(0);

			default:
				System.out.println("You Enetered Wrong Choice.... Please Try Again");
				break;

			}

		}

	}
}
