



package ch04_constructor;

public class MemberManager {

	public static void main(String[] args) {
		
		Member manA = new Member();
		manA.setId("001");
		manA.setName("manA");
		manA.setAge(30);
		manA.info();
		System.out.println();
		
		Member manB = new Member("002", "manB", 50);
		manB.info();
		
	}
	
}
















