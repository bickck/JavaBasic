



package ch08_static;

public class WaterMain {

	public static void main(String[] args) {
		
		Water useA = new Water();
		useA.remainWater();
		
		Water useB = new Water();
		useB.remainWater();
		
		Water useC = new Water();
		
		useC.remainWater();
		
		Water.fillWater();
		Water.remainWater();
		
		
		
	}
	
}
