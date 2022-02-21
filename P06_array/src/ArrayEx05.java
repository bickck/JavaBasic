



public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		
		int[] sub = arr;
		sub[1] = 7;
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("sub[1] : " + sub[1]);
		
		
		
	}
	
}















