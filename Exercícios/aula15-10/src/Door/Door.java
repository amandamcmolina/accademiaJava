package Door;

public class Door {
	private String color;
	private boolean opened = false;
	private double dimensionX;
	private double dimensionY;
	private double dimensionZ;
	
	public Door(String color, double dimensionX, double dimensionY, double dimensionZ){
		this.color = color;
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.dimensionZ = dimensionZ;
		
	}

	public String getColor() {
		return color;
	}
	
	public void colorIt(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void open() {
		this.opened = true; 
	}
	
	public void close() {
		this.opened = false; 
	}
	
	public boolean isOpen() {
		return this.opened;
	}
	
	public void dimensionChange(double dimensionX, double dimensionY,double dimensionZ) {
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.dimensionY = dimensionY;
	}
	
	@Override
	public String toString() {
		return "Cor: " + this.color + "\n" + "Aberta: " + this.opened + "\n" + "X: " + this.dimensionX + "\n" 
	+ "Y: " + this.dimensionY + "\n" + "Z: " + this.dimensionY;
	}

	public double getDimensionX() {
		return dimensionX;
	}

	public void setDimensionX(double dimensionX) {
		this.dimensionX = dimensionX;
	}

	public double getDimensionY() {
		return dimensionY;
	}

	public void setDimensionY(double dimensionY) {
		this.dimensionY = dimensionY;
	}

	public double getDimensionZ() {
		return dimensionZ;
	}

	public void setDimensionZ(double dimensionZ) {
		this.dimensionZ = dimensionZ;
	}
	
	
}
