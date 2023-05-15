
/*
 *  Write a Java program that creates two threads. The first thread should print even
	numbers between 1 and 10, and the second thread should print odd numbers
	between 1 and 10.
 */


package in.ineuron;

import in.ineuron.service.EvenService;
import in.ineuron.service.OddService;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Thread evenThread = new Thread(new EvenService());
		Thread oddThread = new Thread(new OddService());
		
		evenThread.run();
		oddThread.run();
		
		
		
		
		
	}

}
