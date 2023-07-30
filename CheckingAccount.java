public class CheckingAccount extends BankAccount{
	private double fee = 0.15;
	private String accountNumber;

	public CheckingAccount(String name, double initialAmount){
		super(name, initialAmount);
		this.accountNumber = this.getAccountNumber() + "-10";
		this.setAccountNumber(this.accountNumber);
	}

	public boolean withdraw(double amount) {
		if(amount > this.getBalance()) {
			return false;
		}
		
		if((amount + fee) > getBalance()) {
			return false;
		}
		
		
		double amountAfterFees = (amount + fee);
		return super.withdraw(amountAfterFees);
	}

}