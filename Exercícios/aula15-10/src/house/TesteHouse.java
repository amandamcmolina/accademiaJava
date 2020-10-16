package house;
import Door.Door;

public class TesteHouse {
	
	public static void main(String[] args) {
		Door firstDoor = new Door("red", 10, 10, 10);
		Door secondDoor = new Door("red", 10, 10, 10);
		Door thirdDoor = new Door("yellow", 10, 10, 10);

		
		House casaUm = new House("blue", firstDoor, secondDoor, thirdDoor);
		casaUm.colorIt("Pink");
		
//		System.out.println(casaUm.getColor());
		System.out.println(casaUm);
	}
	
}
