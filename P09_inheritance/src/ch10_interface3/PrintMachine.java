



package ch10_interface3;

import java.util.Scanner;

public class PrintMachine {

	private Print current;  // 현재 연결된 장치
	private int device;     // 1.프린터  2.스캐너
	private Printer printer; 
	private Scan scan;
	private Scanner scanner;
	
	public PrintMachine() {
		printer = new Printer();
		scan = new Scan();
		scanner = new Scanner(System.in);
		device = 1;
		current = printer;
	}
	
	public boolean modeSelct() {
		System.out.print("1.장치 선택   2.인쇄/취소 > ");
		int mode = scanner.nextInt();
		
		switch(mode) {
		case 1: // 장치 선택
			selectDevice(); break;
		case 2: // 인쇄, 취소
			printRun(); break;
		case 0: // 전원 off
			return false;
		}
		return true;
	}
	
	public void selectDevice() {
		System.out.print("1.프린터  2.스캐너  > ");
		device = scanner.nextInt();
		
		if(device == 1)
			current = printer;
		else if(device == 2)
			current = scan;
	}
	
	public void printRun() {
		System.out.print("1.시작  2.취소  > ");
		int select = scanner.nextInt();
		
		if(select == Print.START)
			current.printStart();
		else if(select == Print.CANCEL)
			current.printCancel();
	}
	
}
























