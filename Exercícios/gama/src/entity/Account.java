package entity;

abstract public class Account {

		private int account;
		protected double balance;
		private String name;
		
//		public Account(int balance) {
//			this.balance = balance;
//		}

		public int getAccount() {
			return account;
		}

		public void setAccount(int account) {
			this.account = account;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void deposit(double amount) {
			this.balance += amount;
		}

		abstract public void withdraw(double amount);

		public void accountIncome() {
			this.balance *= 0.7;
		}

		public void transfer(double amount, Account account) {
			if (this.balance > amount) {
				withdraw(amount);
				account.deposit(amount);
			} else {
				System.out.println("bateu");
			}
			
		}

		@Override
		public String toString() {
			return "Conta: " + this.account + "\n" + "Saldo: " + this.balance + "\n" + "Nome: " + this.name;
		}
		
		
		public String printAllAccountInfo() {
		  String info = "Name: " + this.name;
		  info += "\nAccount number: " + this.account;
		  info += "\nAmount: R$" + this.balance;

		  return info;
		}
		
		
}
