package account;

public class TesteAccount {
	public static void main(String[] args) {
		Account contaUm = new Account();
		contaUm.setAccount(1234);
		contaUm.setBalance(2000);
		contaUm.setName("Amanda");
		Account contaDois = new Account();

//		System.out.println(contaUm);
		contaUm.withdraw(500); //1500
//		System.out.println(contaUm.getBalance());
		
		contaUm.transfer(200, contaDois);
		System.out.println(contaUm.getBalance());
//		System.out.println(contaUm.getBalance());
		System.out.println(contaDois);
	}
}
