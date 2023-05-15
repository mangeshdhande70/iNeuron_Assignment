package in.ineuron.service;

public class Processor {
	
	String processorName;
	String companyName;
	String processorType;
	
	/*
	 * Constructor is a special type of function which has same name as a class name.
	 * Using Constructor we can initialize the value of the Object while Object Creation & matching constructor will call while creating object
	 * Every class have at-least one constructor if you not create any constructor then and then JVM will create default constructor
	 * In every constructor there is a super() method or this() method, only one can be there not both at time.
	 * super() method is used to call parent class constructor with matching constructor parameter & this() method is used to call itself matching constructor.
	 *  
	 */
	public Processor() {
		super();
	}


	public Processor(String processorName, String companyName) {
		super();
		this.processorName = processorName;
		this.companyName = companyName;
	}


	public Processor(String processorName, String companyName, String processorType) {
		super();
		this.processorName = processorName;
		this.companyName = companyName;
		this.processorType = processorType;
	}

	
	
	
	

	public String getProcessorName() {
		return processorName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public String getProcessorType() {
		return processorType;
	}


	@Override
	public String toString() {
		return "Processor [processorName=" + processorName + ", companyName=" + companyName + ", processorType="
				+ processorType + "]";
	}
	
	
	

}
