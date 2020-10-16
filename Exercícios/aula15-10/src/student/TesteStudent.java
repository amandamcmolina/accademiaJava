package student;

public class TesteStudent {
	public static void main(String[] args) {
		Student estudante = new Student("amanda", 26);
		estudante.setAge(26);
		System.out.println(estudante.getAge());
		System.out.println(estudante.getName());
		
		estudante.happyBirthday();
		System.out.println(estudante.getAge());
		
		System.out.println(estudante);
	}
}
