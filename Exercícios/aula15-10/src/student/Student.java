package student;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void happyBirthday() {
		this.age += 1;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\n" + "Idade: " + this.age;
	}
}
