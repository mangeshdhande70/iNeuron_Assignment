/*
 *  Write a Java program that uses polymorphism by defining an interface called Shape
	with methods to calculate the area and perimeter of a shape. Then create classes
	that implement the Shape interface for different types of shapes, such as circles and
	triangles.
 * 
 */



package in.ineuron;

import java.util.Scanner;

import in.ineuron.cal.AreaAndPerimenteCalculatorOfShapesImpl;
import in.ineuron.cal.IAreaAndPerimenteCalculatorOfShapes;

public class Runner {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		IAreaAndPerimenteCalculatorOfShapes service = new AreaAndPerimenteCalculatorOfShapesImpl();
		
		while(true) {
			
			
			System.out.println(" Select your choice ");
			System.out.println("\n1. To Find Area Of Circle");
			System.out.println("2. To Find Perimeter Of Circle");
			System.out.println("3. To Find Area Of Triangle");
			System.out.println("4. To Find Perimeter Of triangle");
			System.out.println("5. exit()");
			
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:System.out.println("Enter Radius of the circle :: ");
			       Float radius = scanner.nextFloat();
				   System.out.println("Area of the Circle is ::- "+service.calculateAreaOfCircle(radius)); ;
				   break;
				   
			case 2:System.out.println("Enter Radius of the circle :: ");
		           Float radius1 = scanner.nextFloat();
			       System.out.println("Primeter of the Circle is ::- "+service.calculatePerimeterOfCircle(radius1));
			       break;
			       
			case 3:System.out.println("Enter Base of the Triangle :: ");
		           Float base = scanner.nextFloat();
		           System.out.println("\nEnter Height of the Triangle :: ");
		           Float height = scanner.nextFloat();
			       System.out.println("Area of the Triangle is ::- "+service.calculateAreaOfTriangle(base, height)); ;
			
			case 4: System.out.println("Enter sides of the circle :: ");
	                Float s1 = scanner.nextFloat();
	                Float s2 = scanner.nextFloat();
	                Float s3 = scanner.nextFloat();
		            System.out.println("Primeter of the Triangle is ::- "+service.calculatePerimeterOfTriangle(s1, s2, s3));       
		            break;
		            
		    case 5:System.out.println("Exit From the Application");
		    	   System.exit(0);
		    
		    default: System.out.println("You Enetered Wrong Choice.... Please Try Again");
		    		break;
			
		}
		
		
		
	}

}
	
}
