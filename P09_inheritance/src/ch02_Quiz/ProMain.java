package ch02_Quiz;

public class ProMain {

	public static void main(String[] args) {
		SmartPhone proA = new SmartPhone("갤럭시 s22", 10000);
		proA.showInfo();
		System.out.println();

		SmartPhone proB = new SmartPhone("갤럭시 s23", "SK ", "010-2222-3333", 10000);
		proB.showInfo();
		System.out.println();

	}
}
