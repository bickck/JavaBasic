



package ch03_format;

import java.text.DecimalFormat;

/*
 * DecimalFormat 
 * - 숫자를 원하는 형식의 문자열로 변환할 때 사용합니다
 *   > 0 : 10 진수, 빈자리 0으로 채움
 *     # : 10 진수, 빈자리 0으로 채우지 않음
 */

public class ExDecimalFormat {

	public static void main(String[] args) {
		
		double data = 123456.789;
		System.out.println("data : " + data);
		System.out.println();
		
		DecimalFormat df = null;
		
		df = new DecimalFormat("0");
		String sa = df.format(data);
		System.out.println("sa : " + sa);
		System.out.println();
		
		df = new DecimalFormat("0.00");
		String sb = df.format(data);
		System.out.println("sb : " + sb);
		System.out.println();
		
		df = new DecimalFormat("###,###.#");
		String sc = df.format(data);
		System.out.println("sc : " + sc);
		System.out.println();
		
		
	}
	
}















