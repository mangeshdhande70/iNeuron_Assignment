package in.ineuron.usingabstract;

public class IciciBankServiceUsingAbstractClassImpl extends BankServiceUsingAbstractClass {
	
	
	private float balance = 9800f;


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
