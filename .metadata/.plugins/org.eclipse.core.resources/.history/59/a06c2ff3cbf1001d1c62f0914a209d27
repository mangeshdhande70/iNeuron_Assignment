package in.ineuron.usinginterface;

public interface IBankServiceUsingInterface {
	

	// every method in interface is by default public & abstract
	// Inside you can't have concrete method means you can't declare body of method in interface but from java 8 you can create default & static method body.
	// the variable declared inside interface is by default private and final so, you need to initialize the value of variable while declaring.  
	String checkBalance();
	String withdraw(float amount);
	String deposite(float amount);
	
	default String serviceDefaultMethpod() {
		return "Hi Customer, Welcome to Our Bank" ;		
	}

}
