



package ch03_generic2;

public class ProductTest {

	public static void main(String[] args) {
		
		Product<Computer, String> proA = new Product<>();
		proA.setKind(new Computer("데스크탑"));
		proA.setModel("LG i7");
		Computer comA = proA.getKind();
		System.out.println("종류 : " + comA.getName() + " - 모델 : " + proA.getModel());
		System.out.println();
		
		Product<Computer, String> proB = new Product<>(new Computer("노트북"), "LG gram");
		Computer comB = proB.getKind();
		System.out.println("종류 : " + comB.getName() + " - 모델 : " + proB.getModel());
		System.out.println(proB);
		
	}
	
}














