package in.ineuron.usingabstract;

abstract public class BankServiceUsingAbstractClass {
	
	
	
	public String checkBalance() {
     	return	"Your balance is :: 5000";	
	}
	
	public abstract String withdraw(float amount);
	public abstract String deposite(float amount);

}
