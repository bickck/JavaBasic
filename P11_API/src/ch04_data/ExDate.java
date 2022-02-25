package ch04_data;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date
 * - 날짜를 표현할 때 사용합니다.
 * 
 * SimpleDateFormat
 * - 날짜를 원하는 형태의 문자열로 변환하는 클래스입니다.
 * 	y 년도			H 0 ~ 23시
 * 	m 월				h 
 *  d 일
 *  D 1 ~ 365
 *  E 요일
 *  a 오전/오후
 */

public class ExDate {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		System.out.println();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String today = dateFormat.format(date);
		System.out.println(today);
	}
}
