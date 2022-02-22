



package ch08_static;

public class Water {

	static int cc = 1000;
	
	Water(){
		if(cc > 0) {
			cc -= 200;
		} else {
			System.out.println("물이 없습니다..");
		}
	}
	
	static void remainWater() {
		System.out.println("남은물 : " + cc + "cc");
	}
	
	static void fillWater() {
		cc = 1000;
	}
	
}













