package entity;

public class CheckingAccount extends Account{
	public String getType() {
		return "CheckingAccount";
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
