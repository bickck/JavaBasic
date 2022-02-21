



public class MethodEx04 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		System.out.println("main arr : " + arr);
		
		areaTest();
		
		int a = 1;
		referenceTest(arr, a);
		
	}
	
	public static void referenceTest(int[] tmp, int a) {
		System.out.println("refe tmp : " + tmp);
		tmp[0] = 10;
		a = 1000;
	}
	
	public static void areaTest() {
		int[] arr = new int[3];
		System.out.println("area arr : " + arr);
	}
	
}






















