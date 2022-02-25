package ch02_String;

import java.text.DecimalFormat;

public class ExDecimalFormat {

	/*
	 * DecimalFormat - 숫자를 원하는 형식의 문자열로 변환할 때 사용합니다 > 0 : 10진수, 빈자리를 0으로 채움 # :
	 * 10진수, 빈자리를 0으로 채우지 않음
	 */

	public static void main(String[] args) {
		double data = 123456.789;
		System.out.println("data : " + data);
		System.out.println();

		DecimalFormat df = null;

		df = new DecimalFormat("0");
		String sa = df.format(data);
		System.out.println("sb : " + sa);
		System.out.println();

		df = new DecimalFormat("###,###.0");
		String sc = df.format(data);
		System.out.println("sc : " + sc);
		System.out.println();
	}
}
