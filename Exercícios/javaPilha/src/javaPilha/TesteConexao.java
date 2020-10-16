package javaPilha;

public class TesteConexao {
	public static void main(String[] args) {

		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			String msg = ex.getMessage();
			System.out.println("Exc: " + msg);
		} 
	}
}
