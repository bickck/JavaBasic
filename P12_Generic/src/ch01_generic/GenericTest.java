package ch01_generic;

public class GenericTest {

	public static void main(String[] args) {
		
		Basic basicA = new Basic();
		basicA.setObj(new String("basicA"));
		String stnA = (String)basicA.getObj();
		System.out.println(stnA);
		System.out.println();
		
		Basic basicB = new Basic();
		basicB.setObj(new Fruits("충주 사과", 20));
		Fruits frA = (Fruits)basicB.getObj();
		System.out.println(frA);
		System.out.println();
		
		ExGeneric<String> gnA = new ExGeneric<String>();
		gnA.setData("text");
		String stnB = gnA.getData();
		System.out.println(stnB);
		System.out.println();
		
		ExGeneric<Fruits> gnB = new ExGeneric<>();
		gnB.setData(new Fruits("청주 사과", 10));
		Fruits frB = gnB.getData();
		System.out.println(frB);
		System.out.println();
		
		ExGeneric<Integer> gnC = new ExGeneric<Integer>();
		gnC.setData(123);
		int value = gnC.getData();
		System.out.println(value);
		System.out.println();
		
		ExGeneric<String> gnD = new ExGeneric<>();
		gnD.setData("1000");
		int ia = Integer.parseInt(gnD.getData());
		System.out.println(ia + 1000);
		
		
		
	}
	
}


















