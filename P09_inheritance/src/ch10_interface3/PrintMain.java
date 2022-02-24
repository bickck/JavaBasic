



package ch10_interface3;

public class PrintMain {

	public static void main(String[] args) {
		
		PrintMachine pm = new PrintMachine();
		
		boolean run = true;
		while(run) {
			run = pm.modeSelct();
			System.out.println();
		}
		System.out.println("- Power off -");
		
	}
	
}


















