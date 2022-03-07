



package ch01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress class
 * - IP 주소를 처리할 때 사용하는 클래스입니다
 */

public class ExInetAddress {

	public static void main(String[] args) {
		
		InetAddress ia1 = null;
		InetAddress ia2 = null;
		
		try {
			ia1 = InetAddress.getByName("www.daum.net"); // 해당 주소의 ip
			ia2 = InetAddress.getLocalHost();            // 컴퓨터의 ip 주소
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("www.daum.net -> " + ia1.getHostAddress()); // 주소 문자열 반환
		System.out.println("컴퓨터 IP -> " + ia2.getHostAddress());
		
	}
	
}



















