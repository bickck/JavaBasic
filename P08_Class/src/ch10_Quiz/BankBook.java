package ch10_Quiz;

public class BankBook {

	private static double rate;
	private final String account_number;
	private String user_name;
	private int money;

	static {
		rate = 2;
	}

	public BankBook(int money, String user_name, String account_number) {
		this.account_number = account_number;
		this.money = money;
		this.user_name = user_name;
	}

	public void insert_money(int money) {
		System.out.println("잔액 입금 : " + money);
		this.money += money;
		System.out.println("잔액 :" + this.money);
	}

	public void remove_money(int money) {
		if (this.money >= 0) {
			System.out.println(money + "원이 인출되었습니다. ");
			this.money -= money;
			System.out.println("남은 잔액 :" + money + "원 입니다. ");
		} else {
			System.out.println("출금액 오류~");
		}

	}

	public void setRate(int rate) {
		BankBook.rate = rate;
	}

	public static void currentRate() {
		System.out.println("현재 이율 확인 :" + rate + "%");
	}

	public void show_BankBook() {
		System.out.println("------ 계좌 정보  ------");
		System.out.println("계좌 번호 :" + account_number);
		System.out.println("고객 이름 :" + user_name);
		System.out.println("잔고:" + money);
	}

}
