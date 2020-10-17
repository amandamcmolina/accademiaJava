package entity;

public class TesteAccount {
	public static void main(String[] args) {
//		Account contaUm = new Account();
//		contaUm.setAccount(1234);
//		contaUm.setBalance(2000);
//		contaUm.setName("Amanda");
//		Account contaDois = new Account();

////		System.out.println(contaUm);
//		contaUm.withdraw(500); //1500
////		System.out.println(contaUm.getBalance());
//		
//		contaUm.transfer(200, contaDois);
//		System.out.println(contaUm.getBalance());
////		System.out.println(contaUm.getBalance());
//		System.out.println(contaDois);
		
		
		
		CheckingAccount cc = new CheckingAccount();
		String tipo = cc.getType();
		cc.setBalance(5000);
		System.out.println(tipo);
		
		SavingsAccount cp = new SavingsAccount();
		cc.transfer(100, cp);
		
		System.out.println(cc.getBalance());
		System.out.println(cp.getBalance());
		
		SavingsAccount outraConta = new SavingsAccount();

		
		
		
	}
}
