
/*
 * Write a Java program that takes an integer from the user and throws an exception
   if it is negative.Demonstrate Exception handling of same program as solution.
 * 
 */


package in.ineuron;

import java.util.Scanner;

import in.ineuron.service.ExceptionService;
import in.ineuron.service.ExceptionServiceHandler;

public class Runner {
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		ExceptionService service = new ExceptionService();
		ExceptionServiceHandler serviceHandler = new ExceptionServiceHandler();
		
		System.out.println("Please Enter Negative Number :: ");
		int number = scanner.nextInt();
		
//	    System.out.println("After calling Negative value Number Method withpount Handling :: "+service.checkNegativeNumberOrNot(number));	
		
		System.out.println("After Calling Negative Number Method with Handling Logic :: "+serviceHandler.checkNegativeNumberOrNot(number));
		
		System.out.println("After Calling Negative Number Method with Handling Logic Using Try & Catch :: "+serviceHandler.checkNegativeNumberOrNotUsingTryCatch(number));
	}

}
