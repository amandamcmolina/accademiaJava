package Door;

public class TesteDoor {
	public static void main(String[] args) {
	Door porta = new Door("Yellow", 0.70, 2.5, 0.35);
		
		porta.colorIt("red");
		
		porta.open();
//		porta.close();
		System.out.println(porta);
		
		System.out.println(porta.isOpen()); 
		
		porta.dimensionChange(1, 2, 3);
		
		System.out.println(porta.getDimensionY());
	}
}
