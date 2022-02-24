



package ch08_interface2;

public class Player implements Power, Volume {

	public void on() {
		System.out.println("전원 ON");
	}
	
	public void off() {
		System.out.println("전원 OFF");
	}
	
	public void up() {
		System.out.println("소리을 올려요~");
	}
	
	public void down() {
		System.out.println("소리을 내려요~");
	}
	
}


















