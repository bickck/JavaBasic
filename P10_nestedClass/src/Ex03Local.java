



class Outer3 {
	
	private int a;
	
	public Outer3() { a = 1; }
	
	public void info() {
		
		class Local {
			private int b;
			
			public Local() { b = 2; }
			
			public void localInfo() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
			}
			
		}
		Local li = new Local();
		li.localInfo();
		
	}
	
}

public class Ex03Local {

	public static void main(String[] args) {
		
		Outer3 ot3 = new Outer3();
		ot3.info();
		
	}
	
}
























