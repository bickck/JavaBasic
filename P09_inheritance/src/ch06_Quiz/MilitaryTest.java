package ch06_Quiz;

public class MilitaryTest {

	public static void main(String[] args) {
		
		Military army = new Army("1사단");			
		army.attack();
		army.move();
		
		Military navy = new Navy("1함대");
		navy.attack();
		navy.move();
		
		Military airforce = new AirForce("항공단");
		airforce.attack();
		airforce.move();
		
		Military specialforce = new SpecialForce("특수부대");
		specialforce.attack();
		specialforce.move();
		
		
	}
}
