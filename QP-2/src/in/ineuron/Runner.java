/*
 * Write a Java program to invoke parent class constructor from a child class. Create
   Child class object and parent class constructor must be invoked. Demonstrate by
   writing a program. Also explain key points about Constructor.
 * 
 */


package in.ineuron;

import in.ineuron.service.Laptop;
import in.ineuron.service.LaptopService;

public class Runner {
	
	public static void main(String[] args) {
		
		LaptopService service = new LaptopService();
		
		Laptop info = service.getLaptopInfo();
		
		System.out.println("Laptop Id:: "+info.getLaptopComapny());
		System.out.println("Laptop Company Name :: "+info.getLaptopComapny());
		System.out.println("Ram in Laptop (In GB) :: "+info.getRam());
		System.out.println("Processor Name :: "+info.getProcessorName());
		System.out.println("Processor Type ::  "+info.getProcessorType());
		System.out.println("Processor Company Name :: "+info.getCompanyName());
		
	}

}
