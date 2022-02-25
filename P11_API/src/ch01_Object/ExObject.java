



package ch01_Object;

//import java.lang.*;

class Test extends Object {
	
}

public class ExObject {

	public static void main(String[] args) {
		
		String stnA = "test";
		System.out.println();
		
		Test testA = new Test();
		
		Object oA = new Object();
		Object oB = new Object();
		
		// getClass() : class type 반환
		System.out.println("getClass() : " + oA.getClass());
		
		// hashCode() : 객체 고유 번호
		System.out.println("oA.hashCode() : " + oA.hashCode());
		System.out.println("oB.hashCode() : " + oB.hashCode());
		
		// toString() : getClass(), hashCode() 조합
		System.out.println("toString() : " + oA.toString());
		System.out.println("oA : " + oA);
		
		// eqauals() : 동일한 객체인지 확인 ( 같으면 true, 다르면 false )
		System.out.println("oA.equals(oB) : " + oA.equals(oB));
		
		
	}
	
}
















