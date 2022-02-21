

package ch05_switch;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		String member = "vip";
		int dc = 0;
		
		switch(member) {
		case "vip":
			dc = 20;
			break;
		case "gold":
			dc = 10;
			break;
		case "일반":
			dc = 5;
			break;
		}
		System.out.println("회원 등급 : " + member);
		System.out.println("할인        : " + dc + "%");
		
		if(member.equals("vip"))
			dc = 20;
		else if(member.equals("gold"))
			dc = 10;
		else if(member.equals("일반"))
			dc = 5;
		System.out.println("회원 등급 : " + member);
		System.out.println("할인        : " + dc + "%");
		
	}
	
}




















