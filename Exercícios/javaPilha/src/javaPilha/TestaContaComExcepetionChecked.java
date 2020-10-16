package javaPilha;

public class TestaContaComExcepetionChecked {
	public static void main(String[] args) {
		Conta c = new Conta(); 
		try {
			c.deposita();
		}catch(MinhaException ex) {
			System.out.println("tratamento....");
		}
		
	}
}
