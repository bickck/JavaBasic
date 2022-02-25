package ch04_data;

import java.util.Calendar;

public class ExCalendar {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);

		int sec = now.get(Calendar.SECOND);

		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println(hour + "시" + min + "분" + sec + "초");
	}
}
