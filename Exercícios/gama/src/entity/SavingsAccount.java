package entity;

public class SavingsAccount extends Account{
	
	
	public String getType() {
		return "SavingAccount";
	}
	
	@Override
	public void withdraw(double amount) {
		if (this.balance > amount) {
			this.balance = this.balance + 0.10 - amount;
		} else {
			System.out.println("bateu");
		}
	}
}
