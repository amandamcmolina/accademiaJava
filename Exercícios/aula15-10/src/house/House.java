package house;
import Door.Door;

public class House {
	private String color;
	private Door firstDoor;
	private Door secondDoor;
	private Door thirdDoor;
	public int totalPortas = 0;
	
	public House(String color, Door firstDoor, Door secondDoor, Door thirdDoor) {
		this.color = color;
		this.firstDoor = firstDoor;
		this.secondDoor = secondDoor;
		this.thirdDoor = thirdDoor;
	}
	
	public String getColor() {
		return color;
	}
	public void colorIt(String color) {
		this.color = color;
	}
	public Door getFirstDoor() {
		return firstDoor;
	}
	public void setFirstDoor(Door firstDoor) {
		this.firstDoor = firstDoor;
	}
	public Door getSecondDoor() {
		return secondDoor;
	}
	public void setSecondDoor(Door secondDoor) {
		this.secondDoor = secondDoor;
	}
	public Door getThirdDoor() {
		return thirdDoor;
	}
	public void setThirdDoor(Door thirdDoor) {
		this.thirdDoor = thirdDoor;
	}
	
	public int howManyDoorsAreOpen() {
		
		if(this.firstDoor.isOpen()) {
			totalPortas += 1;
		}
		if(this.secondDoor.isOpen()) {
			totalPortas += 1;
		}
		if(this.thirdDoor.isOpen()) {
			totalPortas += 1;
		}
		
		return this.totalPortas;
	}
	
	@Override
	public String toString() {
		return "Cor: " + this.color + "\n" + "Cor da Primeira porta: " + this.firstDoor.getColor() + "\n" + "Cor da segunda Porta: " + this.secondDoor.getColor()  + "\n" 
	+ "Cor da terceira porta: " + this.thirdDoor.getColor();
	}
	
}
