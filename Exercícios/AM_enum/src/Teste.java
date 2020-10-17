
public class Teste {
	public static void main(String[] args) {
		
		
		
		Thread t = new Thread(() -> System.out.println("rodando"));
		Thread tt = new Thread(() -> System.out.println("rodando2"));
//		Thread ttt = new Thread(numero());
		
		tt.setPriority(Thread.MAX_PRIORITY);
		tt.setPriority(Thread.MAX_PRIORITY);
		tt.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		tt.start();
		
	}
	
//	public static int numero() {
//		return 1;
//	}
}
