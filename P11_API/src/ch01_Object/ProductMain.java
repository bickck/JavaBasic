



package ch01_Object;

public class ProductMain {

	public static void main(String[] args) {
		
		Product proA = new Product("001");
		Product proB = new Product("001");
		Product proC = new Product("002");
		
		System.out.println("proA : " + proA);
		System.out.println("proB : " + proB);
		System.out.println("proC : " + proC);
		System.out.println();
		
		System.out.println(proA.equals(proB));
		System.out.println(proA.equals(proC));
		System.out.println();
		
		
	}
	
}















