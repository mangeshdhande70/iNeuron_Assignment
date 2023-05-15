
/*
 *  Write a Java program that reads a set of integers from the user and stores them in a
	List. The program should then find the second largest and second smallest elements
	in the List
 */


package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter 5 numbers");
		for(int i=0 ; i<5 ; i++) {
			int num = scanner.nextInt();
			list.add(num);
		}
		
		
		System.out.println("Second Smallest Number in a List is :: "+findSmallestSecondNumber(list));
		
		System.out.println("\n\nSecond Highest Number in a List is :: "+findHighestSecondNumber(list));
		
		
	}
	
	
	public static int findSmallestSecondNumber(List<Integer> list) {
		
		 List<Integer> list2 = list.stream().sorted().toList();
		 return list2.get(1);
		
	}
	
	public static int findHighestSecondNumber(List<Integer> list) {
		
		 List<Integer> list2 = list.stream().sorted().toList();
		 return list2.get(list2.size()-2);
		
		
	}

}
