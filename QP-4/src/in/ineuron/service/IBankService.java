package in.ineuron.service;

public interface IBankService {
	
	public String checkBalance();
	public String withdraw(float amount);
	public String deposite(float amount);

}
