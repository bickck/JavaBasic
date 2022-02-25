



package ch05_Wrapper;

/*
 * 파싱( parsing )
 * - 문자열을 분석해서 해당 데이터의 기본자료형으로 변환합니다
 *   > parse기본자료형
 */

class Test {
	
	private String value;
	
	public Test(String value) {
		this.value = value;
	}
	
	public String getValue() { return value; }
	
}

public class Ex02Parse {

	public static void main(String[] args) {
		
		String stnA = "100";
		System.out.println("stnA : " + stnA);
		System.out.println(stnA + 1);
		System.out.println();
		
		//int ia = stnA;
		int ia = Integer.parseInt(stnA);
		System.out.println();
		
		String stnB = "2.4";
		double da = Double.parseDouble(stnB);
		System.out.println();
		
		Test testA = new Test("123");
		String sa = testA.getValue();
		int a = Integer.parseInt(sa);
		
		Test testB = new Test("3.4");
		double b = Double.parseDouble(testB.getValue());
		
	}
	
}


















