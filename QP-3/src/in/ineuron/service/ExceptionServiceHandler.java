package in.ineuron.service;

public class ExceptionServiceHandler{

	public String checkNegativeNumberOrNot(int number) {
		
		if (number < 0) {	
			number = Math.abs(number);
		}

       int[] arr = new int[number];
		
	   return "Size of the Array is ::"+arr.length;
		
	}
	
	
	public String checkNegativeNumberOrNotUsingTryCatch(int number) {
		
		  int[] arr = null;
		
		try {
			arr = new int[number];
		}catch (NegativeArraySizeException e) {
		    return "Please Enter Positive Size of the Array";
		}
		catch (Exception e) {
			return "Unknoen Exception :: "+e;
		}
	   return "Size of the Array is ::"+arr.length;
		
	}

}
