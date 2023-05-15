package in.ineuron.usinginterface;

public class IciciBankServiceUsingInterfaceImpl implements IBankServiceUsingInterface {
	
	
	private float balance = 9800f;

	@Override
	public String checkBalance() {
		return "Your Balance is :: "+balance ;
	}

	@Override
	public String withdraw(float amount) {
		balance-=amount;
		return "Your remaining balance is :: "+balance;
	}

	@Override
	public String deposite(float amount) {

		balance+=amount;
		return "Your Total balance is :: "+balance;
	}

}
